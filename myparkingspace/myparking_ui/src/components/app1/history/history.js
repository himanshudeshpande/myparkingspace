import React from 'react';
import './history.css'
import HM from './historymain';
import Axios from 'axios';


class History extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state={objects:[]}
        this.getHistory();
    }
   
    getHistory = () =>
    {
        if(this.props.v.id>0)
        {
            Axios.post("http://localhost:8081/user/getHistory", 
            {
                id: this.props.v.id
            }).then((Response) => {
                this.setState({objects: Response.data});
            });
        }
    }

    render()
    {
        console.log(this.props.v);
        var dis = [];
        for (const iterator of this.state.objects) {
            dis.push(<HM object={iterator}/>);
        }

        return(
            <div>
                <h1 class="bg-info text-white">
                    HISTORY
                </h1>
            <table class="table table-primary"> 
                <div className="container">
                    <h2 className="col-sm-6"></h2> 
                    {dis.map((value) =>{return value})}
                </div>
            </table>
            </div>
        );
    }
}
export default History;