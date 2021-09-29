import React from 'react';
import Axios from 'axios';


class VendorLogin extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state = {
            email: "",
            password: ""
        }
    }
    verifyVendor = () =>{
        // if(this.state.email=="vendor" && this.state.password=="vendor")
        // {
            console.log("vendor logged in1")
            this.props.setDealer(2);
        // }
        // Axios.post("http://localhost:8081/login/verifydealer",
        // {
        //     email: this.state.email,
        //     password: this.state.password
        // }).then((Response) => 
        // {
        //     console.log(Response.data);
        //     if(Response.data!="-1" && Response.data!="0")
        //         this.props.setUser(Response.data);
        // });
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
                <h1>Vendor Login Here</h1>
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
                        <button type="submit" className="btn btn-dark mt-3" onClick={this.verifyVendor}class="btn btn-success">Submit</button>
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

export default VendorLogin;