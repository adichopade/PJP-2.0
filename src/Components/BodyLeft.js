import React from 'react'
import './BodyLeft.css'

function BodyLeft() {
    return (
        <div className="Left">
            <div className="subcategories">
                <h2><u>Categories</u></h2>
                <a href="url">Return to clothing Shoes or Accessories</a>
                <a href="url">Dresses</a>
                <a href="url">Tops,Tees and Blouses</a>
                <a href="url">Sweaters</a>
                <a href="url">Fashion Hoodies and SweatShirts</a>
                <a href="url">Jeans</a>
            </div>
            <div className="Filter">
                <h2><u>Filter</u></h2>
                <input type="text" placeholder="Search.."></input>
            </div>
            <div className="condition">
                <h2><u>Condition</u></h2>
                <div class="checkbox">
                    <label><input type="checkbox" value=""/><span className="para">New</span></label><br></br>
                    <label><input type="checkbox" value=""/><span className="para">Used</span></label><br></br>
                    <label><input type="checkbox" value=""/><span className="para">Collectable</span></label><br></br>
                    <label><input type="checkbox" value=""/><span className="para">Renewed</span></label>
                </div>
            </div>
            <div className="condition">
                <h2><u>Price</u></h2>
                <div class="checkbox">
                    <label><input type="checkbox" value=""/><span className="para">Under $25</span></label><br></br>
                    <label><input type="checkbox" value=""/><span className="para">$25 to $50</span></label><br></br>
                    <label><input type="checkbox" value=""/><span className="para">$50 to $100</span></label><br></br>
                    <label><input type="checkbox" value=""/><span className="para">More than $100</span></label>
                </div>
            </div>
            <div className="condition">
                <h2><u>Avg Customer Review</u></h2>
                <div className="space">
                    <span class="fa fa-star checked"></span>
                    <span class="fa fa-star checked"></span>
                    <span class="fa fa-star checked"></span>
                    <span class="fa fa-star checked"></span>
                    <span class="fa fa-star checked"></span>
                </div>
                <div className="space">
                    <span class="fa fa-star checked"></span>
                    <span class="fa fa-star checked"></span>
                    <span class="fa fa-star checked"></span>
                    <span class="fa fa-star checked"></span>
                    <span class="fa fa-star"></span>
                </div>
                <div className="space">
                    <span class="fa fa-star checked"></span>
                    <span class="fa fa-star checked"></span>
                    <span class="fa fa-star checked"></span>
                    <span class="fa fa-star"></span>
                    <span class="fa fa-star"></span>
                </div>
                <div className="space">
                    <span class="fa fa-star checked"></span>
                    <span class="fa fa-star checked"></span>
                    <span class="fa fa-star "></span>
                    <span class="fa fa-star"></span>
                    <span class="fa fa-star"></span>
                </div>
                <div className="space">
                    <span class="fa fa-star checked"></span>
                    <span class="fa fa-star "></span>
                    <span class="fa fa-star "></span>
                    <span class="fa fa-star"></span>
                    <span class="fa fa-star"></span>
                </div>
            </div>
            <div className="condition">
                <h2><u>Sizes</u></h2>
                <div class="checkbox">
                    <label><input type="checkbox" value=""/><span className="para">34</span></label><br></br>
                    <label><input type="checkbox" value=""/><span className="para">36</span></label><br></br>
                    <label><input type="checkbox" value=""/><span className="para">38</span></label><br></br>
                    <label><input type="checkbox" value=""/><span className="para">40 and above</span></label>
                </div>
            </div>
        </div>
    )
}

export default BodyLeft
