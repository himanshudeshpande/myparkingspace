import React from 'react';
import Packagedetail from './packagedetail';

class Package extends React.Component
{
    constructor(props)
    {
        super(props);
    }
    
    render()
    {
        var packages = [];
        for (const iterator of this.props.slot.spot_type_prices) 
        {
            packages.push(<Packagedetail package={iterator}/>)
        }
        return(
                    
                        <div className="card">
                            <div class="card text-center">
                                <div className="header1">
                                    <h3>{this.props.slot.type + " - " + this.props.slot.no_of_spot} </h3>
                                </div><hr/>
                                <table>
                                    <thead>
                                        <tr>
                                            <th>Time</th>
                                            <th>Start Time</th>
                                            <th>End Time</th>
                                            <th>Price</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        {packages.map((value)=>{return value})}
                                    </tbody>
                                </table>
                            </div>   
                        </div>
            );
}
}

export default Package;