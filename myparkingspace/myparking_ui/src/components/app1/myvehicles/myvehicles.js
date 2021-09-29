import React from 'react';
import VD from './vehicledetails';
import './2.css'



class MyVehicles extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        // console.log(this.props.u);
        var dis = [];
        for (const iterator of this.props.u.vehicles) {
            dis.push(<VD object={iterator}/>)
        }

        return(
            <div className="container-fluid">
               <table class="table table-primary">
                    <h1 className="col-sm-12" class="bg-info text-white">MY VEHICLE DETAILS</h1><hr/>
                    {dis.map((value) => {return value})}
                    </table>
                </div>
            
        );
    }
}

export default MyVehicles;