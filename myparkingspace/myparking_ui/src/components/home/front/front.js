import React from "react";
import './front.css'
class Home extends React.Component

{
    constructor(props)
    {
        super(props);
    }
    render()
    {
        return (
            <div>
                <div className="header">
                    <h3>WELCOME</h3><hr/>
                    <p class="bg-info text-white">MY PARKING SPACE</p>
                        <div className="header1">
                            <p class="bg-secondary text-white">Vehicle Parking Space Locator & Booker</p>
                        </div>
                </div><br/><br/><br/>
                <div className="container">
                    <p>My parking space is the automated portal which reduces the human effort for finding the parking space in 
                        cities. It provides platform to the drivers to find near by vacant parking space they drivers can book their
                        parking space according to their timing and pay by simple payment methods available on portal.
                    </p>
                </div>
                <div>

                </div><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
                <div className="footer">
                    <h4>MyParkingSpace Pvt. Ltd.</h4>
                    <h5>Balewadi,Pune(411045)</h5>
                    <h5>9874563552</h5>
                </div>
            </div>

        );
    }
};

export default Home