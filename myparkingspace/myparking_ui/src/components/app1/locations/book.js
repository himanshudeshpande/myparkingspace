import axios from 'axios';
import React from 'react';

class Book extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state={b_t: [], e_t: []};
    }

    createBooking = () =>{

        axios.post("http://localhost:8081/user/book", {
            begin_time: this.state.b_t,
	        end_time: this.state.e_t,
            spot_type_id: this.props.object.id,
            vehicle_id: this.props.v.id
        }).then((Response) =>{
            console.log(Response.data);
        })
    }

    onChangeBeginTime = (event) =>{
        this.setState({b_t:event.target.value}, () =>{console.log(this.state.b_t)})
    }

    onChangeEndTime = (event) =>{
        this.setState({e_t:event.target.value}, () =>{console.log(this.state.e_t)})
    }
    
    render()
    {
        return(
            <table>
                <tr>
                    <td><label>Begin Time: </label></td>
                    <td><input type="datetime-local" onChange={this.onChangeBeginTime}></input></td>
                </tr>
                <tr>
                    <td><label>End Time: </label></td>
                    <td><input type="datetime-local" onChange={this.onChangeEndTime}></input></td>
                </tr>
                <tr><button onClick={this.createBooking}>Book</button></tr>
            </table>
        );
    }
    
}
export default Book;