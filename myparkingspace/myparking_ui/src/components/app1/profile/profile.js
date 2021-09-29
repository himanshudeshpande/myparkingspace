import React from 'react';
import Detail_Box from './detail_box';
import Axios from 'axios';
import './profile1.css'

class Profile extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state = {
            json_string: ""
        }
        // this.getUserData();
    }

    getUserData = () =>
    {
        Axios.post("http://localhost:8081/user/getProfile", 
        {
            id: this.props.id
        }).then((Response) => {
            this.setState({json_string: JSON.stringify(Response.data)});
        });
    }

    render()
    {
        // console.log(this.props.u);
        var dis = [];
        for (const iterator of this.props.u.vehicles) {
            dis.push(<div>
                             <br></br>
                            <p><b>Vehicle Type:</b> {iterator.type}</p>
                            <p><b>Vehicle Registration no:</b> {iterator.registration_no}</p>
                            <br></br>
                    </div>
                    )
        }
        return(
            <div className="container-fluid">
                <div className="header" class="bg-info text-white">
                    <h1>Personal Details</h1>
                </div><br/><hr/><br/><br/>
                <div className="body border border-dark">
                    <div className="row">
                    <div className="col-sm-2">
                        <img className="img-thumbnail width=50px"></img> 
                    </div>
                    <div className="col-sm-3"></div>
                    <div className="col-sm-4">
                        <p><b>Name :</b> {this.props.u.name.first_name +" "+this.props.u.name.last_name}</p><br/>
                        <p><b>Email :</b> {this.props.u.email}</p><br/>
                        <p><b>Mobile no :</b> {this.props.u.mobile}</p><br/>
                        <div class="dropdown dropright">
                                <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Dropdown Example
                                <span class="caret"></span></button>
                                <ul class="dropdown-menu border border-dark">
                                    <li>{dis.map((value) => {return value})}</li>
                                </ul>
                            </div>   
                    </div>
                    </div>
                    </div>
                    </div>
         
        );
    }
}
export default Profile;