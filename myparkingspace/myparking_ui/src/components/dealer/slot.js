import axios from 'axios';
import React from 'react';
import Package from './package';

class Brands extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state = {d: [], status: "null"};
        this.getDealer();
    }

    getDealer = () =>{
        console.log(this.props.id);
        axios.post("http://localhost:8081/vendorcont/getVendor", 
        {
            id: this.props.id
        }).then((Response) =>{
            console.log(Response.data);
                this.setState({d: Response.data}, () => {this.setState({status: "done"})});
        })
    }
    
    render()
    { 
        console.log(this.state.d);
        if(this.state.status=="done")
        {
            console.log(this.state.d);
            var slots = [];
            
                for (const iterator of this.state.d.spot_types) 
                {
                    slots.push(<Package slot={iterator}/>)
                }
            
            return (
                <div className="container">
                    <div className="card-deck">
                    {slots.map((value) =>{return value})}
                    </div>
                </div>
                );

        }
        else
        {
            return <div> </div>;
        }
        
    }
}
    export default Brands;