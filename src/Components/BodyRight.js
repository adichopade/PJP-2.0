import React,{useEffect,useState} from 'react'
import { Button } from 'react-bootstrap';
import axios from "axios";
import './BodyRight.css';


function BodyRight() {
    
    const [posts ,Setposts]=useState([]);

  useEffect(()=>{
    axios.get('http://starlord.hackerearth.com/recipe')
    .then(response => {
      Setposts(response.data);
      console.log(response.data);
    })
    .catch(error => {
      console.log(error);
    });
  },[])
    return (
        <div className="Right">
            
            {posts.map(post=>(
                <div className="card">
                    <h5>{post.name}</h5>
                    <img className="img" src={post.image} alt="im"/>
                    <h4>{post.price}$</h4>
                    <h6>{post.description}</h6>
                    <Button variant="info" >Select</Button>
                
                </div>
              
            ))}
            
        </div>
    )
}

export default BodyRight
