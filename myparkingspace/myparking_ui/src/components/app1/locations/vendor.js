import React from 'react';
import './vendor.css'

class Vendor extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        return(
            <div className="container-fluid"><br/><br/><br/><br/>
            <div className="card-deck">
                <div className="card">
            <div className="row" onClick={this.props.switchViewTo.bind(this,"vendorspots", this.props.object)}>
               <table> 
                        <h3><b>Name :</b> {this.props.object.name}</h3>
                        <p><b>Address:</b> {this.props.object.address.address +", "+
                                    this.props.object.address.city +" - "+
                                    this.props.object.address.pincode +", "+
                                    this.props.object.address.state +", "+
                                    this.props.object.address.country +"."}</p>
                        <p></p>
                </table><br/>
                <div className="button">
                <button type="button" class="btn btn-success">Book</button>
                </div>
            </div>
            </div>
            </div>
            </div>
        );
    }
} 
export default Vendor;