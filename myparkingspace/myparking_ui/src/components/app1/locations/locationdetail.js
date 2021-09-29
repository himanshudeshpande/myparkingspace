import React from 'react';

class LocationDetail extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        console.log(this.props.object);
        return(
            
            <div className="col-sm-4 border border-dark bg-info mt-2 mt-0" style={{height: "200px"}}
            onClick={this.props.switchViewTo.bind(this, "categoryvendors", this.props.object)}>
                <h2>{this.props.object.category}</h2>
            </div>
            
        )
    }
}
export default LocationDetail;