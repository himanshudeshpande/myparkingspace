import React from 'react';
import Home from './home/home';
import App from './app1/app';
import Axios from 'axios';
import Admin from './admin/admin';
import Dealer from './dealer/dealer';

class Main extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state={
            u: [],
            b: [],
            d: [],
            d_l: 0,
            a_l: [],
            v:[],
            status:"loggedout",
            login_type: "user"
        }
    }

    getDealerData = () =>{
        console.log("getting dealer data");
        this.setState({login_type:"dealer"}, () =>{this.setState({status: "logged"})});
    }

    getAdminData = () =>{
        console.log("getting admin data");
        this.setState({login_type:"admin"}, () =>{this.setState({status: "logged"})});
    }

    getData = () =>{
        Axios.post("http://localhost:8081/get/categories").then((Response) => 
        {
            console.log(Response.data);
            var brands = Response.data;
            Axios.post("http://localhost:8081/get/vendors").then((Response) => 
            {
                console.log(Response.data);
                this.setState({b:brands, d:Response.data}, () =>{this.setState({status: "logged"})})
            });
        });
    }

    setUser = (who) =>{
            this.setState({u: who}, () =>{
                this.getData()});
    }

    setDealer = (who) =>{
        this.setState({d_l: who}, () =>{
            this.getDealerData()});
    }

    setAdmin = (who) =>{
        this.setState({a_l: who}, () =>{
            this.getAdminData()});
    }

    logout = () =>{
        this.setState({u: [], d: [], b: [], d_l: []}, () =>{this.setState({status: "loggedout"})});
    }

    render()
    {
        if(this.state.status=="logged")
        {
            switch (this.state.login_type) 
            {
                case "user":
                    return(
                        <div>
                            <App u={this.state.u} c={this.state.b} v={this.state.d} logout={this.logout}/>
                        </div>
                    ); 

                case "admin":
                    return(
                        <div>
                            <Admin a_l={this.state.a_l}/>
                        </div>
                    );

                case "dealer":
                        return(
                            <div>
                                <Dealer d_l={this.state.d_l}/>
                            </div>
                        );
            
                default:
                    break;
            }
            

        }
        else
        {
            return(
                <div>
                    <Home setUser={this.setUser} setAdmin={this.setAdmin} setDealer={this.setDealer}/>
                </div>
            );
        }
    }
}

export default Main;