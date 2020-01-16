import React,{Component} from 'react';
import './App.css';
import Dashboard from './Components/Dashboard';
import Header from './Layout/Header'

class App extends Component {
  render(){
    return (
      <div className="App">
        <header className="App-header">
        <Header/> 
        <Dashboard/>
          
        </header>
      </div>
    );
  }
  
}

export default App;
