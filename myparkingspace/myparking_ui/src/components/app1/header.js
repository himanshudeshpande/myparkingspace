import React from 'react';

class Header extends React.Component
{
    constructor(props)
    {
        super(props);
    }
    render()
    {
        var vehicles = [];
        for (const iterator of this.props.u.vehicles) {
            vehicles.push(<a className="dropdown-item" href="#" onClick={this.props.switchVehicleTo.bind(this,iterator)}>{iterator.registration_no}</a>);
        }
        return(             
                 <nav className=" navbar navbar-expand-sm bg-dark">
                    <ul className="navbar-nav">
                        {/* <li className="nav-item">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "home")}>Home</a>
                        </li> */}
                        <li className="nav-item">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "locations")}>Home</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "bookings")}>Bookings</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "history")}>History</a>
                        </li>
                       
                    </ul>
                    <ul className="navbar-nav ml-auto">
                        <li className="nav-item">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "myvehicles")}>My Vehicles</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "profile")}>Profile</a>
                        </li>
                        <li className="nav-item dropdown">
                            <div className="container-fluid">
                                <a className="nav-link dropdown-toggle text-black" href="#" id="navbardrop" data-toggle="dropdown">
                                    City
                                </a>
                                <div className="dropdown-menu">
                                    
                                    <a className="dropdown-item" href="#">Mumbai</a>
                                    <a className="dropdown-item" href="#">Nagar</a>
                                    <a className="dropdown-item" href="#">Satara</a>
                                </div>
                            </div>
                        </li>
                        <li className="nav-item dropdown">
                            <div className="container-fluid">
                                <a className="nav-link dropdown-toggle text-black" href="#" id="navbardrop" data-toggle="dropdown">
                                    Vehicles
                                </a>
                                <div className="dropdown-menu">
                                    {vehicles.map((value) => {return value})}
                                </div>
                            </div>
                        </li>
                    </ul> 
                </nav>
        );
    }
}

export default Header;