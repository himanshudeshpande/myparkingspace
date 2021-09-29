import React from 'react';
import Bookings from './bookings/bookings';
import History from './history/history';
import Home from './home/home';
import Locations from './locations/locations';
import MyVehicles from './myvehicles/myvehicles';
import Profile from './profile/profile';

class Body extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        console.log(this.props.v);
        switch (this.props.menu) 
        {
            case "bookings": 
                return(
                    <div>
                        <Bookings u={this.props.u} v={this.props.v}/>
                    </div>
                );     
            case "history":
                return(
                    <div>
                        <History u={this.props.u} v={this.props.v}/>
                    </div>
                ); 
            case "home":
                return(
                    <div>
                        <Locations u={this.props.u} v={this.props.v}/>
                    </div>
                ); 
            case "locations":
                return(
                    <div>
                        <Locations u={this.props.u} v={this.props.v}/>
                    </div>
                ); 
            case "myvehicles":
                return(
                    <div>
                        <MyVehicles u={this.props.u} v={this.props.v}/>
                    </div>
                ); 
            case "profile":  
                return(
                    <div>
                        <Profile u={this.props.u} v={this.props.v}/>
                    </div>
                ); 
            default:
                return(
                    <div>
                        <Home u={this.props.u} v={this.props.v}/>
                    </div>
                ); 
        }
    }
}
export default Body;