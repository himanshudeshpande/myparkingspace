import React from 'react';
import Brandcard from './brandcard';
import axios from 'axios';
import './brands.css'

class Brands extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state = {brands: []};
        this.getBrands();
    }

    getBrands = () =>{
        axios.post("http://localhost:8081/get/categories").then((Response) =>{
            console.log(Response.data);
            this.setState({brands: Response.data});
        })
    }

    render()
    { 
        var cards = [];
        for (const iterator of this.state.brands) 
        {
            cards.push(<Brandcard brand={iterator} id={this.props.id} getBrands={this.getBrands}/>)
        }
        return (
            <div className="container-fluid">
                <div className="row">
                    {cards.map((value) =>{return value})}
                </div><br/>
        </div>
       
            );

    }
}
export default Brands; 