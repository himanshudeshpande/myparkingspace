import React from 'react';
import S from './spot';
import './vendor.css'

class VendorSpots extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        var dis = [];
        for (const iterator of this.props.object.spot_types) {
            dis.push(<S object={iterator} switchViewTo={this.props.switchViewTo}/>);
        }
        return(
            <div className="card-deck">
             <div className="card">
                <div>
                  {dis.map((value) =>{return value})}
                </div>
             </div>
            </div>
        );
    }
} 
export default VendorSpots;