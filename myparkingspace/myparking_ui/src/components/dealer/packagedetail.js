import React from 'react';

class Packagedetail extends React.Component
{
    constructor(props)
    {
        super(props);
    }
    
    render()
    {
        return(
                    <tr>
                        <td>{this.props.package.time_unit_time + " " + this.props.package.time_unit_unit}</td>
                        <td>{this.props.package.time_slot_start}</td>
                        <td>{this.props.package.time_slot_end}</td>
                        <td>{this.props.package.price + " " + this.props.package.price_unit}</td>
                    </tr>
            );
        }
        }
        
export default Packagedetail;