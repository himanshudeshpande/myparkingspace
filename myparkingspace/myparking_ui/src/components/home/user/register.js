import axios from 'axios';
import React from 'react';


class Register extends React.Component
{

    constructor(props)
    {
        super(props);
        this.state={
            firstname: "",
            middlename: "",
            lastname: "",
            email: "",
            mobile: "",
            password: "",
            confirm_password: ""
        };
    }

    onchangefirst_name = (event) =>{
        this.setState({firstname: event.target.value});
    }

    onchangemiddle_name = (event) =>{
        this.setState({middlename: event.target.value});
    }

    onchangelast_name = (event) =>{
        this.setState({lastname: event.target.value});
    }

    onchangeemail = (event) =>{
        this.setState({email: event.target.value});
    }

    onchangemobile = (event) =>{
        this.setState({mobile: event.target.value});
    }

    onchangepassword = (event) =>{
        this.setState({password: event.target.value});
    }

    onchangeconfirmpassword = (event) =>{
        this.setState({confirm_password: event.target.value});
    }

    verifyRegistration = () => {
        if(this.state.password==this.state.confirm_password)
        {
            axios.post("http://localhost:8081/registration/userregistration", 
            {
              firstname: this.state.firstname,
              middlename: this.state.middlename,
              lastname: this.state.lastname,
              email: this.state.email,
              mobile: this.state.mobile,
              password: this.state.password  
            }).then((Response) => {
                console.log(Response.data);
                if(Response.data == true)
                    this.props.switchTypeTo(1);
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
                    <h1>Register Here</h1>
                </div>
            <div className="container border border-dark"style={{width: "500px", marginTop: "50px", paddingTop: "5px"}}>
                <div class="container">
                <div className="row" style={{margin: "50px"}}>
                   <label><b>First name</b></label>
                    <input type="text" className="form-control" placeholder="Ente First name"  onChange={this.onchangefirst_name.bind(this)}/>
                </div>
                <div className="row" style={{margin: "50px"}}>
                   <label><b>Middle name</b></label>
                    <input type="text" className="form-control" placeholder="Enter Middle name"  onChange={this.onchangemiddle_name.bind(this)}/>
                </div>
                <div className="row" style={{margin: "50px"}}>
                   <label><b>Last name</b></label>
                    <input type="text" className="form-control" placeholder="Enter Last name"  onChange={this.onchangelast_name.bind(this)}/>
                </div>
                <div className="row" style={{margin: "50px"}}>
                    <label><b>Email</b></label>
                    <input type="email" className="form-control" placeholder="Enter email" onChange={this.onchangeemail.bind(this)}/>
                </div>
                <div className="row" style={{margin: "50px"}}>
                    <label><b>Mobile No</b></label>
                    <input type="number" className="form-control" placeholder="Enter mobile no" onChange={this.onchangemobile.bind(this)}/>
                </div>
                <div className="row" style={{margin: "50px"}}>
                   <label><b>Password</b></label>
                    <input type="password" className="form-control" placeholder="Enter password"  onChange={this.onchangepassword.bind(this)}/>
                </div>
                <div className="row" style={{margin: "50px"}}>
                   <label><b>Confirm Password</b></label>
                    <input type="password" className="form-control" placeholder="Enter password again"  onChange={this.onchangeconfirmpassword.bind(this)}/>
                </div>
                <div className="row" style={{margin: "50px"}}>
                    <button type="submit" className="btn btn-dark mt-3" onClick={this.verifyRegistration}class="btn btn-success">Register</button>
                </div>
                <div className="footer">
                    <p>Already a user,<a href="login.js">Click here!</a></p>
                </div>
                </div>
                </div>
            </div>
        );
    }
}
export default Register;