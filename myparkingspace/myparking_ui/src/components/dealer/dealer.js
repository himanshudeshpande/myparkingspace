import React from 'react';
import Header from './header';
import Profile from './profile';
import Dashboard from './dashboard';

class Dealer extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state={view: "profile"}
    }

    switchMenu =(what) =>{
        this.setState({view:"profile"},
            () => {this.setState({view:"dashboard"}, 
                () => {this.setState({view: what})}
                )});
    }

    render()
    {
        switch (this.state.view) 
        {
            case "profile":
                return (<div>
                    <Header switchMenu={this.switchMenu}/>
                    <Profile id={this.props.d_l}/>
                </div>);
            
            case "dashboard":
                return (<div>
                    <Header switchMenu={this.switchMenu}/>
                    <Dashboard id={this.props.d_l}/>
                </div>);
        
            default:
                return (<div>
                    <Header switchMenu={this.switchMenu}/>
                    <Profile id={this.props.d_l}/>
                </div>);
        }
    }
}
export default Dealer;