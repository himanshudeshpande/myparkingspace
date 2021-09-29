import React from 'react';
import airport from '../../../images/airport.png';
import bank from '../../../images/bank.png';
import castle from '../../../images/castle.png';
import church from '../../../images/church.png';
import cinema from '../../../images/cinema.png';
import factory from '../../../images/factory.png';
import firestation from '../../../images/firestation.png';
import hosp from '../../../images/hosp.png';
import hotel from '../../../images/hotel.png';
import malls from '../../../images/malls.png';
import museum from '../../../images/museum.png';
import police from '../../../images/police.png';
import post from '../../../images/post.png';
import Resto from '../../../images/Resto.png';
import school from '../../../images/school.png';
import theatre from '../../../images/theatre.png';


class locationpic extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
      
        return(
            <div className="container container-fluid">
                 
                <div className="col-sm-*">
                
                 <img src={airport} alt="image" class="border border-secondary rounded-circle"/>
                 <img src={bank} alt="image" class="border border-secondary rounded-circle"/>  
                 <img src={castle} alt="image"class="border border-secondary rounded-circle"/> 
                 <img src={church} alt="image"class="border border-secondary rounded-circle"/>
                 
                 <img src={cinema} alt="image" class="border border-secondary rounded-circle"/> 
                 <img src={factory} alt="image" class="border border-secondary rounded-circle"/> 
                 <img src={firestation} alt="image" class="border border-secondary rounded-circle"/>
                 <img src={hosp} alt="image" class="border border-secondary rounded-circle"/>
                  
                 <img src={hotel} alt="image" class="border border-secondary rounded-circle"/> 
                 <img src={malls} alt="image" class="border border-secondary rounded-circle"/> 
                 <img src={museum} alt="image" class="border border-secondary rounded-circle"/> 
                 <img src={police} alt="image" class="border border-secondary rounded-circle"/> 
                                  
                 <img src={post} alt="image" class="border border-secondary rounded-circle"/>
                 <img src={Resto} alt="image" class="border border-secondary rounded-circle"/>  
                 <img src={school} alt="image" class="border border-secondary rounded-circle"/> 
                 <img src={theatre} alt="image" class="border border-secondary rounded-circle"/> 
                 
                </div>
                <div className="col-sm-12 container-fluid"></div>
            </div>
            
        );
    }
}
export default locationpic;