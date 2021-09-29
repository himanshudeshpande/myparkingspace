import React from 'react';
import VB from './vehiclebookings';
import './2.css'

class VehicleDetails extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        var dis = [];
        for (const iterator of this.props.object.bookings) {
            dis.push(<VB object={iterator}/>)
        }
        console.log(this.props.object);
        return(
            <div>
                <div className="row">
                    <div className="col-sm-0">
                        <img className="img-thumbnail width=10px"></img> 
                    </div><br/><br/><br/><br/><br/><br/><br/>
                    
                    <div className="col-sm-12" class="bg-success text-black">
                        <p><b>Type :</b>{this.props.object.type}</p>
                        <p><b>Registration No :</b> {this.props.object.registration_no}</p>
                    </div>
                </div>
                <div>
                    {dis.map((value) => {return value})}
                </div>
            </div>

        );
    }
}
export default VehicleDetails;