import './style.css'
import { ReactComponent as YoutubeIcon } from './Youtube.svg'
import { ReactComponent as InstagramIcon } from './Instagram.svg'
import { ReactComponent as LinkedIn } from './Linkedin.svg'

export default function Footer(){
  return (
    <footer className="main-footer">
      Projeto desenvolvido durante a 2ª ed. do evento Semana DevSuperior
      <div className="footer-icons">
        <a href="/" target="_new">
          <YoutubeIcon />
        </a>
        <a href="/" target="_new">
          <InstagramIcon />
        </a>
        <a href="/" target="_new">
          <LinkedIn />
        </a>
      </div>
    </footer>
  )
}