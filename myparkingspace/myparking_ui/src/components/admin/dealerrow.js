import axios from 'axios';
import React from 'react';

class DealerRow extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    verifyDealer = () =>{
        axios.post("http://localhost:8081/vendorcont/verifyVendor", 
        {
            id: this.props.dealer.id
        }).then((Response) =>{
            console.log(Response.data);
            if(Response.data==true)
                this.props.getAllDealers(); 
        })
    }

    deleteDealer = () =>{
        axios.post("http://localhost:8081/vendorcont/deleteVendor", 
        {
            id: this.props.dealer.id
        }).then((Response) =>{
            console.log(Response.data);
            if(Response.data==true)
                this.props.getAllDealers();
        })
    }

    render()
    {
        var verified = [];
        if(typeof this.props.dealer.date_start !=="undefined")
        {
            verified = <p>Verified</p>;
        }
        else
        {
            verified = <button onClick={this.verifyDealer}>Verify</button>
        }
        return(
            <tr>
                <td>{this.props.dealer.name}</td>
                <td>{this.props.dealer.email}</td>
                <td>{this.props.dealer.mobile_no}</td>
                <td>{this.props.dealer.address.address}</td>
                <td>{this.props.dealer.address.city}</td>
                <td>{this.props.dealer.address.pincode}</td>
                <td><b>{verified}</b></td>
                <td><button onClick={this.deleteDealer} type="button" class="btn btn-danger">Delete</button></td>
            </tr>
        );
    }
}
export default DealerRow;