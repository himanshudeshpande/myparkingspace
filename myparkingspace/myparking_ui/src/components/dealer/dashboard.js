import React from 'react';
import axios from 'axios';
import './dashboard.css'

class Dashboard extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state = {d: [], status: "null"};
        this.getDealer();
    }

    getDealer = () =>{
        console.log(this.props.id);
        axios.post("http://localhost:8081/vendorcont/getVendor", 
        {
            id: this.props.id
        }).then((Response) =>{
            console.log(Response.data);
                this.setState({d: Response.data}, () => {this.setState({status: "done"})});
        })
    }

    render()
    {
        if(this.state.status=="done")
        {
            var dis = [];

        for (const iterator of this.state.d.spot_types) 
        {
            for (const iterator1 of iterator.bookings) 
            {
                dis.push(<tr>
                    <td>{iterator1.type}</td>
                    <td>{iterator1.date}</td>
                    <td>{iterator1.start_time}</td>
                    <td>{iterator1.end_time}</td>
                    <td>{iterator1.time_in}</td>
                    <td>{iterator1.time_out}</td>
                    <td>{iterator1.vehicle_registration_no}</td>
                </tr>)
            }
        }

        return <div>
             
            <div class="container-fluid">
                    <h1 class="bg-info text-white">
                        Dashboard
                    </h1>
            <table class="table table-hover">
                        <thead>
                        <tr>
                            <th>type</th>
                            <th>date</th>
                            <th>start_time</th>
                            <th>end_time</th>
                            <th>time_in</th>
                            <th>time_out</th>
                            <th>Vehicle Registration No</th>
                        </tr>
                        </thead>
                        <tbody>
                            {dis.map((value) =>{return value})};
                        </tbody>
                    </table>
            </div>
        </div>;
        }
        return <div></div>;
        
    }
}
export default Dashboard;