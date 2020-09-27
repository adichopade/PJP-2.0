import React from 'react'
import './Footer.css'


function Footer() {
    return (
        <div className="main-footer">
            <div className="container">
                <div className="row">
                    <div className="col-md-3 col-sm-6">
                        <h4>About me</h4>
                            <ul className="list-unstyled">
                                <li>We are the leading company in selling food items.</li>
                            </ul>
                    </div>
                    <div className="col-md-3 col-sm-6">
                        <h4>Products</h4>
                            <ul className="list-unstyled">
                                <li>Pepsi</li>
                                <li>Pizza</li>
                                <li>Pasta</li>
                            </ul>
                    </div>
                    <div className="col-md-3 col-sm-6">
                        <h4>Useful Links</h4>
                            <ul className="list-unstyled">
                                <li>click 1</li>
                                <li>click 2</li>
                                <li>click 3</li>
                            </ul>
                    </div>
                    <div className="col-md-3 col-sm-6">
                        <h4>Contacts</h4>
                        <ul className="list-unstyled">
                                <li>Katraj</li>
                                <li>Pune</li>
                                <li>Maharashtra</li>
                            </ul>
                    </div>    
                </div>
                <hr/>
                <div className="row abc" >
                    <p className="col-sm">
                        &copy;{new Date().getFullYear()} Shopify | All Right Reserved | Terms Of Service | Privacy
                    </p>
                </div>
            </div>

            
        </div>
        
       


    )
}

export default Footer
