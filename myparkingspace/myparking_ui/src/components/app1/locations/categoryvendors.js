import React from 'react';
import V from './vendor';

class CategoryVendors extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        var dis = [];
        for (const iterator of this.props.object.vendors) {
            dis.push(<V object={iterator} switchViewTo={this.props.switchViewTo}/>);
        }
        return(
            <div className="container-fluid">
                {dis.map((value) =>{return value})}
            </div>
        );
    }
} 
export default CategoryVendors;