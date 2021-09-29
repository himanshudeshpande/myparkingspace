import React from 'react';
import './vendor.css'

class Spot extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    getSpotData = () =>{
        
    }

    render()
    {
        return(
            <div className="conatiner-fluid">
            <div className="card-deck">
                    <div className="card"><br/><br/>
                        <div class="container">
                        <h3><b>Type :</b> {this.props.object.type}</h3><br/>
                        <h3><b>Number of Spots:</b> {this.props.object.no_of_spot}</h3>
                        <p></p>
                        </div>
                        <div className="button">
                        <button type="button" class="btn btn-success" onClick={this.props.switchViewTo.bind(this,"book", this.props.object)}>Book</button>
                        </div>
                        </div>
                    </div>
            </div>
        );
    }
} 
export default Spot;