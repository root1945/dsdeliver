import './style.css'
import { ReactComponent as Logo } from './logo.svg'
export default function Navbar(){
  return (
    <nav className="main-navbar" >
      <Logo />
      <a href="/" className="logo-text" >DS Delivery</a>
    </nav>
  )
}