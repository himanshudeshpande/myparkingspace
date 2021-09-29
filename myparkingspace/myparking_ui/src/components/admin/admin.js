import axios from 'axios';
import React from 'react';
import DealerRow from './dealerrow';
import './admin.css'


class Admin extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state = {dealers: []};
        this.getAllDealers();
    }

    getAllDealers = () =>{
            axios.post("http://localhost:8081/get/vendors").then((Response) => {
                console.log(Response.data);
                this.setState({dealers: Response.data});
            });
    }

    render()
    {
        // console.log(this.props);
        var dis =[];
        for (const iterator of this.state.dealers) 
        {
            dis.push(<DealerRow dealer={iterator} getAllDealers={this.getAllDealers}/>)            
        }
        return(
            <div>
                <div className="bgimg">
                <div class="container-fluid">
                    <h1 class="bg-info text-white">

                        ADMIN VIEW
                    </h1><hr/><br/>
                    <table class="table table-hover table-bordered">
                            <thead>
                                <tr>
                                    <th>Vendor Name</th>
                                    <th>Vendor Email</th>
                                    <th>Vendor Mobile No</th>
                                    <th>Vendor Address</th>
                                    <th>Vendor City</th>
                                    <th>Vendor Pincode</th>
                                    <th>Verify User</th>
                                    <th>Delete User</th>
                                </tr>
                            </thead> 
                            <tbody>
                                {
                                    dis.map((value) =>{return value})
                                }
                            </tbody>  
                            
                        </table>
                    </div>
                </div>     
            </div>
        );
    }
}
export default Admin;