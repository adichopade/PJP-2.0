import React from 'react'
// import SearchIcon from '@material-ui/icons/Search';

// import ShoppingBasketIcon from '@material-ui/icons/ShoppingBasket';
import './TopBar.css';

function TopBar() {
    return (
        <div className="topbar">
            <div>
                <img className="header_logo" src="http://pngimg.com/uploads/amazon/amazon_PNG11.png" alt="logo"></img>
            </div>
            <div className="header_search">
                <input type="text" className="header_searchinput" />
                <div className="header_searchicon"/>
            </div>
            <div className="header_nav">
                <div className="header_link">
                    <div className="header_option">
                        <span>Hello </span>
                        <span className="header_optionSecondLine">Sign in</span>
                    </div>
                </div>
                <div className="header_link">
                    <div className="header_option">
                        <span>Returns</span>
                        <span className="header_optionSecondLine">and orders</span>
                    </div>
                </div>
                <div className="header_link">
                    <div className="header_option">
                        <span>Your</span>
                        <span className="header_optionSecondLine">Prime</span>
                    </div>
                </div>
                <div className="header_link">
                    <div className="header_optionbracket">
                        <span>Basket</span>
                        <span className="basket_value">0</span>
                        
                    </div>
                </div>
                
            </div>
            
        </div>
    )
}

export default TopBar
