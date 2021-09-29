import React from 'react';
import Header from './header';
import Login from './user/login';
import Register from './user/register';
import Front from './front/front';
import DealerRegistration from './dealer/dealerregistration';
import DealerLogin from './dealer/dealerlogin';
import AdminLogin from './admin/login'



class Home extends React.Component
{

    constructor(props)
    {
        super(props);
        this.state={
            type: 3
        }
    }

    switchTypeTo = (which) =>{
        this.setState({type: which});
    }

    render()
    {
        switch (this.state.type) {
            case 1:
                return(
                    <div>
                        <Header switchTypeTo={this.switchTypeTo}/>
                        <Login setUser={this.props.setUser}/>
                    </div>
                );
                
        
            case 2:
                return(
                    <div>
                        <Header switchTypeTo={this.switchTypeTo}/>
                        <Register setUser={this.props.setUser} switchTypeTo={this.switchTypeTo}/>
                     </div>
                );
                case 3:
                    return(
                    <div>
                        <Header switchTypeTo={this.switchTypeTo}/>
                         <Front setUser={this.props.setUser}/>
                    </div>
                );
                case 4:
                    return(
                    <div>
                        <Header switchTypeTo={this.switchTypeTo}/>
                         <DealerRegistration switchTypeTo={this.switchTypeTo}/>
                    </div>
                );
                case 5:
                    return(
                    <div>
                        <Header switchTypeTo={this.switchTypeTo}/>
                         <DealerLogin setDealer={this.props.setDealer}/>
                    </div>
                );

                case 6:
                    return(
                    <div>
                        <Header switchTypeTo={this.switchTypeTo}/>
                         <AdminLogin setAdmin={this.props.setAdmin}/>
                    </div>
                );
                
           default: 
                return(
                    <div>
                        <Header switchTypeTo={this.switchTypeTo}/>
                        <Login setId={this.props.setId}/>
                    </div>
                );
        }
        
    }
}

export default Home;