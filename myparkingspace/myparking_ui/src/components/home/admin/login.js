import React from 'react';
import Axios from 'axios';
import './adminlogin.css'



class Login extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state = {
            email: "",
            password: ""
        }
    }
    verifyAdmin = () =>{
        if(this.state.email=="admin" && this.state.password=="admin")
        {
            console.log("admin login1");
            this.props.setAdmin([]);
        }
    }

    changeEmail = (event) =>{
        this.setState({email: event.target.value});
    }

    changePassword = (event) =>{
        this.setState({password: event.target.value});
    }

    render()
    {
        return(
            <div>
                <div className="bgimg">
                <h1>Admin login</h1>
            <div className="container border border-dark"style={{width: "500px", marginTop: "100px", height: "500px", paddingTop: "40px"}}>
                    
                    <div className="row" style={{margin: "50px"}}>
                        <label><b>Email</b></label>
                        <input type="email" className="form-control" placeholder="Enter email" onChange={this.changeEmail.bind(this)}/>
                    </div>
                    <div className="row" style={{margin: "50px"}}>
                        <label><b>Password</b></label>
                        <input type="password" className="form-control" placeholder="Enter password" onChange={this.changePassword.bind(this)}/>
                        <a href="#" className="text-right">Forgot password?</a>
                    </div>
                    <div className="row" style={{margin: "50px"}}>
                        <button type="submit" className="btn btn-dark mt-3" onClick={this.verifyAdmin}class="btn btn-success">Submit</button>
                    </div>
                    <div id="root">
                    
                    </div>
                </div><br/><br/><br/><br/>
                <hr/>
                </div>
        </div>
        );
    }
}

export default Login;