import React from 'react';

class Header extends React.Component
{
    constructor(props)
    {
        super(props);
    }
    render()
    {
       
        return(
            <nav className="navbar navbar-expand-sm bg-dark">
                <ul className="navbar-nav">
                    
                <li className="nav-item">
                        <a className="nav-link text-white" href="#" onClick={this.props.switchTypeTo.bind(this,3)}>Home</a>
                    </li>
                    <li className="nav-item">
                        <a className="nav-link text-white" href="#" onClick={this.props.switchTypeTo.bind(this,1)}>User Login</a>
                    </li>
                    <li className="nav-item">
                        <a className="nav-link text-white" href="#" onClick={this.props.switchTypeTo.bind(this,2)}>User Registration</a>
                    </li>
                    <li className="nav-item">
                        <a className="nav-link text-white" href="#" onClick={this.props.switchTypeTo.bind(this,5)}>Vendor Login</a>
                    </li>
                    <li className="nav-item">
                        <a className="nav-link text-white" href="#" onClick={this.props.switchTypeTo.bind(this,4)}>Vendor Registration</a>
                    </li>
                    <li className="nav-item">
                        <a className="nav-link text-white" href="#" onClick={this.props.switchTypeTo.bind(this,6)}>Admin</a>
                    </li>
                </ul>
          </nav>
        );
    }
}

export default Header;