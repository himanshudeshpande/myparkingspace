import React from 'react';
import Header from './header';
import Body from './body';

class App extends React.Component
{
    constructor(props)
    {
        super(props);
        var vid = [];
                for (const iterator of this.props.u.vehicles) {
                    vid = iterator;
                }
        this.state={
            menu: "home",
            v: vid,
        }
    }

    switchMenu = (menuitem) =>{
        this.setState({menu: "home"}, () =>{this.setState({menu: menuitem}, () => {console.log(this.state.menu)})})
        
    }

    switchVehicleTo = (what) =>{
        this.setState({v: what});
    }
    
    render()
    {
        console.log(this.props);
        return(
            <div>
                <Header switchMenu={this.switchMenu} u={this.props.u} switchVehicleTo={this.switchVehicleTo}/>
                <Body menu={this.state.menu} u={this.props.u} v={this.state.v} switchVehicleTo={this.switchVehicleTo}/>
               
            </div>
        )
    }
}
export default App;