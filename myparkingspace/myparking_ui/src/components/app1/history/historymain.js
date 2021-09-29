import React from 'react';
import './history.css'

class Historymain extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        console.log(this.props.object);
        return(
            <div className="container-fluid border border-dark ">
                <div className="row">
                    <lable className="col-sm-3"><b>Name :</b>{this.props.object.vendor_name}</lable>
                </div>
                <div className="row">
                   <label className="col-sm-3"><b>Address :</b>{this.props.object.vendor_address.address +" "+ 
                   this.props.object.vendor_address.city + " "+
                   this.props.object.vendor_address.state + " "}</label>
                </div>
                <div className="row">
                   <label className="col-sm-3"><b>Paid :</b> {this.props.object.payment.paid}</label>
                </div>
                <div className="row">
                   <label className="col-sm-3"><b>Review :</b></label>
                </div>
                <div className="row">
                   <label className="col-sm-3"><b>Date :</b>{this.props.object.date}</label>
                </div>
                <div className="row">
                    <div className="col-sm-4 text-left">
                        <label><b>Booked Time Slot :</b>{this.props.object.start_time+" - "+this.props.object.end_time}</label>
                    </div>
                <div className="col-sm-4 text-left">
                    <label><b>Time In :</b> {this.props.object.time_in}</label>
                </div>
                <div className="col-sm-4 text-left">
                    <label><b>Time out :</b> {this.props.object.time_in}</label>
                </div>
                  
                </div> 
                <hr color="black"/>
                </div>
               
               
              
        
        );
    }
}
export default Historymain;