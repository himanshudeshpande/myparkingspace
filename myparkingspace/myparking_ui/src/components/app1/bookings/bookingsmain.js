import axios from 'axios';
import React from 'react';

class Bookingsmain extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    cancelBooking = () =>{
        axios.post("http://localhost:8081/user/cancelBooking", {
            id: this.props.booking.id
        }).then((Response) => {
            console.log(Response.data);
            if(Response.data==true)
            {
                this.props.getBookings();
            }
        })
    }

    render()
    {
        return(
            <div>
                
            <div className="container-fluid border border-dark">                    
                 <div className="row">
                    <lable className="col-sm-1"><b>Name : </b>{this.props.booking.vendor_name}</lable>
                    </div>
        
                    <div className="row">
                        <label className="col-sm-1"><b>Address : </b>{this.props.booking.vendor_address.address}</label>
                        </div>
                   <div className="row">
                    <label className="col-sm-6 text-left"><b>Date :</b>{this.props.booking.date}</label>
                    <div className="col-sm-6"><b>Booked Time Slot:</b>{this.props.booking.start_time + " - " + this.props.booking.end_time}</div> 
                    </div>
                    
                    <div className="row"id='button'>
                        <label className="col-sm-10"></label>
                    <button className="col-sm-2 text-align-right " onClick={this.cancelBooking}><b> Cancel Booking</b></button>
                    </div>
                    </div>
                    </div>
            
        );
    }
}
export default Bookingsmain;