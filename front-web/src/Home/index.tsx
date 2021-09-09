import './style.css'
import { ReactComponent as MainImg } from './main.svg'
import Footer from '../footer/index'
import { Link } from 'react-router-dom'
export default function Home() {
  return (
    <>
      <div className="home-container">
        <div className="home-content">
          <div className="home-actions">
            <h1 className="home-title">
              Faça seu pedido <br /> que entregamos <br /> pra você!!!
            </h1>
            <h3 className="home-subtitle">
              Escolha o seu pedido e em poucos minutos <br />
              levaremos na sua porta
            </h3>
            <Link className="home-btn-order" to="/orders">
              <span>
                FAZER PEDIDO
              </span>
            </Link>
          </div>
          <div className="home-img">
            <MainImg />
          </div>
        </div>
      </div>
      <Footer />
    </>
  )
}