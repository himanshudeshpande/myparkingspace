import axios from 'axios';
import React from 'react';
import Bookingsmain from './bookingsmain';

class Bookings extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state={b:[], status: "null"};
        this.getBookings(); 
    }

    getBookings = () =>{
        console.log(this.props.v);
        axios.post("http://localhost:8081/user/getBookings1",
        {
            id: this.props.v.id
        }).then((Response) => {
            console.log(Response.data);
                this.setState({b: Response.data}, () => {this.setState({status: "done"})})
        });
    }

    render()
    {
        if(this.state.status=="done")
        {
            var bookings = [];
            for (const iterator of this.state.b) {
                bookings.push(<Bookingsmain booking={iterator} getBookings={this.getBookings}/>);
            }
            return(
                <div>
                    <div>
                        <h1 class="bg-info text-white">BOOKINGS</h1>
                    </div>
                    {bookings.map((value) =>{return value})}
                 </div>
            );
        }
        return (
            <div>
            </div>
        );
        
    }
}
export default Bookings;