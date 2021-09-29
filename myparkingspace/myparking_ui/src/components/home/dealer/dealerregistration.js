import React from 'react';

import axios from 'axios';


class VendorRegistration extends React.Component
{

    constructor(props)
    {
        super(props);
        this.state={
            name: "",
            country : "India", 
            state: "",
            city: "",
            pincode: 0,
            address1: "",                
            mobile_no: 0,
            email: "",
            password: "",
            confirm_password: ""
        };
    }
    
    onchangeName = (event) =>{
        this.setState({name: event.target.value});
    }

    onchangeState = (event) =>{
        this.setState({state: event.target.value});
    }

    onchangeCity = (event) =>{
        this.setState({city: event.target.value});
    }

    onchangePincode = (event) =>{
        this.setState({pincode: event.target.value});
    }

    onchangeAddress1 = (event) =>{
        this.setState({address1: event.target.value});
    }

    onchangeemail = (event) =>{
        this.setState({email: event.target.value});
    }

    onchangemobile = (event) =>{
        this.setState({mobile_no: event.target.value});
    }

    onchangepassword = (event) =>{
        this.setState({password: event.target.value});
    }

    onchangeconfirmpassword = (event) =>{
        this.setState({confirm_password: event.target.value});
    }

    verifyRegistration = (event) => {
        event.preventDefault();
        if(this.state.password==this.state.confirm_password)
        {
            axios.post("http://localhost:8081/registration/dealerregistration", 
            {
                name: this.state.name,
                country : this.state.country, 
                state: this.state.state,
                city: this.state.city,
                pincode: this.state.pincode,
                address1: this.state.address1,                
                mobile_no: this.state.mobile_no,
                email: this.state.email,
                password: this.state.password
            }).then((Response) => {
                console.log(Response.data);
                if(Response.data==true)
                    this.props.switchTypeTo(5);
                    // this.props.setId(Response.data);
            });
        }
        else{
            console.log("passwords don't match");
            
        }
    }

    render()
    {
        return(
            <div className="bgimg">
                <div className="container-fluid" style={{textAlign: "left"}}>
                    <h1>Vendor Register Here</h1>
                </div>
            <form className="container border border-dark"style={{width: "500px", marginTop: "50px", paddingTop: "5px"}} >
                <div class="container">
                <div className="row" style={{margin: "50px"}}>
                   <label><b>Vendor's name</b></label>
                    <input type="text" className="form-control" placeholder="Ente your name"  onChange={this.onchangeName.bind(this)} required/>
                </div>
                
                <div className="row" style={{margin: "50px"}}>
                    <label><b>Email</b></label>
                    <input type="email" className="form-control" placeholder="Enter email" onChange={this.onchangeemail.bind(this)} required/>
                </div>
                <div className="row" style={{margin: "50px"}}>
                    <label><b>Mobile No</b></label>
                    <input type="number" className="form-control" placeholder="Enter mobile no" onChange={this.onchangemobile.bind(this)} required/>
                </div>
                <div className="row" style={{margin: "50px"}}>
                   <label><b>Password</b></label>
                    <input type="password" className="form-control" placeholder="Enter password"  onChange={this.onchangepassword.bind(this)} required/>
                </div>

                <div className="row" style={{margin: "50px"}}>
                   <label><b>Confirm Password</b></label>
                    <input type="password" className="form-control" placeholder="Enter password again"  onChange={this.onchangeconfirmpassword.bind(this)} required/>
                </div>

                <div className="row" style={{margin: "50px"}}>
                    <label><b>Vendors Address</b></label>
                    <input type="text" className="form-control" placeholder="Enter Dealers Address" onChange={this.onchangeAddress1.bind(this)} required/>
                </div>
                <div className="row" style={{margin: "50px"}}>
                    <label><b>Vendors City</b></label>
                    <input type="text" className="form-control" placeholder="Enter Dealers City" onChange={this.onchangeCity.bind(this)} required/>
                </div>
                <div className="row" style={{margin: "50px"}}>
                    <label><b>Vendors Pincode</b></label>
                    <input type="number" className="form-control" placeholder="Enter Dealers Pincode" onChange={this.onchangePincode.bind(this)} required/>
                </div>
                <div className="row" style={{margin: "50px"}}>
                    <label><b>Vendors State</b></label>
                    <input type="text" className="form-control" placeholder="Enter Dealers State" onChange={this.onchangeState.bind(this)} required/>
                </div>
                
                <div className="row" style={{margin: "50px"}}>
                    <button type="submit" className="btn btn-dark mt-3" onClick={this.verifyRegistration}class="btn btn-success">Submit</button>
                </div>
                </div>
                </form>
            </div>
        );
    }
}

export default VendorRegistration;