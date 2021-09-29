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
                 <nav className=" navbar navbar-expand-sm bg-dark">
                    <ul className="navbar-nav">
                        <li className="nav-item">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "profile")}>Profile</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "dashboard")}>Dashboard</a>
                        </li>
                    </ul>
                </nav>
        );
    }
}

export default Header;