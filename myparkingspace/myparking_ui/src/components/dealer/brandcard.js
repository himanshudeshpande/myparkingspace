import axios from 'axios';
import React from 'react';

class Brandcard extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    updateBrand = () =>{
        axios.post("http://localhost:8081/vendorcont/updateVendor", 
        {
            b_id: this.props.brand.id,
            d_id: this.props.id
        }).then((Response) =>{
            console.log(Response.data);
            if(Response.data==true)
            {
                this.props.getBrands();
            }
        })
    }
    
    render()
    {
        var found = false;
        var comp;
        for (const iterator of this.props.brand.vendors) 
        {
            if(iterator.id==this.props.id)
            {
                found=true;
                comp = <input type="checkbox" value="" checked="true"/>
            }
        }
        if(found==false)
        {
            comp = <input type="checkbox" value="" onClick={this.updateBrand}/>
        }
        return(
                    
                        <div className="card col-sm-3">
                            <div class="card text-center">
                                <h2>{comp}{this.props.brand.category}</h2>
                            </div>   
                        </div>
            );
}
}

export default Brandcard;