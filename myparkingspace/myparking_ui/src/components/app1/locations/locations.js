import React from 'react';
import Axios from 'axios';
import LD from './locationdetail';
import CV from './categoryvendors';
import VS from './vendorspots';
import Book from './book';

class Locations extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state = {
            objects: [],
            view: "locationshome",
            view_object: []
        };
        this.getCategories();
    }

    switchViewTo = (what, object) =>{
        this.setState({view: what, view_object: object});
    }

    getCategories = () =>{
        Axios.post("http://localhost:8081/get/categories").then((Response) => {
            this.setState({
                objects: Response.data
            });
        });
    }

    render()
    {
        switch (this.state.view) {
            case "locationshome":
                // console.log(this.state.objects)
                var dis = [];
                for (const iterator of this.state.objects) {
                    dis.push(<LD object={iterator} switchViewTo={this.switchViewTo}/>);
                }
                return(
                    <div className="container-fluid">
                        <div className="row">
                            {dis.map((value) => {return value})}
                        </div>
                    </div>
                );

            case "categoryvendors":
                    // console.log(this.state.objects)
                    return(
                        <CV object={this.state.view_object} switchViewTo={this.switchViewTo}/>
                    );

            case "vendorspots":
                        // console.log(this.state.objects)
                        return(
                            <VS object={this.state.view_object} switchViewTo={this.switchViewTo}/>
                        );

            case "book":
                        // console.log(this.state.objects)
                        return(
                            <Book object={this.state.view_object} switchViewTo={this.switchViewTo} v={this.props.v}/>
                        );
        
            default:
                case "locationshome":
                // console.log(this.state.objects)
                var dis = [];
                for (const iterator of this.state.objects) {
                    dis.push(<LD object={iterator} switchViewTo={this.switchViewTo}/>);
                }
                return(
                    <div>
                        
                    <div className="container-deck">
                        
                        <div className="card-deck">
                            <div className="row">
                                {dis.map((value) => {return value})}
                            </div>
                            </div>
                            </div>
                    </div>
                );
        }
        
    }
}
export default Locations;