

    /* Contenedor centrado como hoja */
    .sheet{
      width:210mm; /* A4 width */
      height:297mm; /* A4 height */
      margin:18mm auto;
      box-sizing:border-box;
      position:relative;
      background:transparent;
      padding:36mm 28mm; /* márgenes interiores para evitar que los adornos oculten texto */
      display:flex;
      align-items:center;
      justify-content:center;
    }

    /* Fondo decorativo: borde floral repetido y esquinas con hongos vintage */
    .sheet::before,
    .sheet::after{
      content:'';
      position:absolute;
      inset:0;
      pointer-events:none;
    }

    /* Borde: usamos imágenes SVG pequeñas repetidas en los 4 ejes */
    .sheet::before{
      background-image:
        /* top */ url('data:image/svg+xml;utf8,<svg xmlns="http://www.w3.org/2000/svg" width="80" height="20"><text x="0" y="14" font-size="14">🌼</text></svg>'),
        /* bottom */ url('data:image/svg+xml;utf8,<svg xmlns="http://www.w3.org/2000/svg" width="80" height="20"><text x="0" y="14" font-size="14">🌸</text></svg>'),
        /* left */ url('data:image/svg+xml;utf8,<svg xmlns="http://www.w3.org/2000/svg" width="20" height="80"><text x="0" y="14" font-size="14">✿</text></svg>'),
        /* right */ url('data:image/svg+xml;utf8,<svg xmlns="http://www.w3.org/2000/svg" width="20" height="80"><text x="0" y="14" font-size="14">✿</text></svg>');
      background-repeat: repeat-x, repeat-x, repeat-y, repeat-y;
      background-position: top center, bottom center, left center, right center;
      mix-blend-mode: multiply;
      opacity:0.85;
      z-index:0;
    }

    /* Esquinas: hongos vintage grandes */
    .corner{
      position:absolute;
      width:90px;
      height:110px;
      z-index:1;
      opacity:0.95;
    }
    .corner svg{width:100%;height:100%;display:block}
    .corner.top-left{left:10px;top:10px;transform:rotate(-8deg)}
    .corner.top-right{right:10px;top:10px;transform:scaleX(-1) rotate(6deg)}
    .corner.bottom-left{left:10px;bottom:10px;transform:scaleY(-1) rotate(6deg)}
    .corner.bottom-right{right:10px;bottom:10px;transform:scale(-1) rotate(-8deg)}

    /* Pequeños hongos estilo Mario dispersos en bordes (cap) */
    .mario-edge{
      position:absolute;
      z-index:1;
      width:28px;height:28px;
      opacity:0.95;
    }
    .m1{left:40px;top:120px}
    .m2{right:40px;top:140px}
    .m3{left:30px;bottom:140px}
    .m4{right:30px;bottom:120px}

    /* Área de contenido (texto) */
    .content{
      text-align:center;
      z-index:2;
      position:relative;
      max-width:140mm;
    }

    .subtitle{
      font-size:14px;
      letter-spacing:1px;
      text-transform:uppercase;
      margin-bottom:8px;
      font-weight:600;
      color:var(--accent);
    }

    .title{
      font-family: 'Playfair Display', serif;
      font-style:italic;
      font-weight:800;
      font-size:48px;
      letter-spacing:4px;
      text-transform:uppercase;
      margin:12px 0 22px 0;
    }

    .name{
      font-size:20px;
      font-weight:600;
      margin-top:28px;
    }

    .group{
      font-size:16px;
      margin-top:6px;
      opacity:0.9;
    }

    /* Para impresión: quitar márgenes del navegador */
    @media print{
      body{margin:0}
      .sheet{margin:0;padding:20mm}
    }
  </style>
</head>
<body>
  <div class="sheet" role="main">

    <!-- esquinas con hongos vintage (SVG inline) -->
    <div class="corner top-left">
      <svg viewBox="0 0 120 150" xmlns="http://www.w3.org/2000/svg" aria-hidden="true">
        <g transform="translate(6,6)">
          <ellipse cx="50" cy="110" rx="40" ry="12" fill="#d9c7b3" />
          <path d="M20 90 C18 70 36 40 54 40 C72 40 90 70 88 90 Z" fill="#7f5b46" opacity="0.15" />
          <path d="M10 82 C18 36 60 18 95 62 C80 20 32 18 10 82 Z" fill="#9b6b4f" />
          <ellipse cx="58" cy="48" rx="48" ry="28" fill="#e9d6c6" />
          <circle cx="42" cy="46" r="4" fill="#c18a6b" />
          <circle cx="76" cy="46" r="3" fill="#c18a6b" />
          <rect x="48" y="80" width="18" height="30" rx="6" fill="#f6efe8" transform="rotate(-6 57 95)"/>
        </g>
      </svg>
    </div>

    <div class="corner top-right">
      <svg viewBox="0 0 120 150" xmlns="http://www.w3.org/2000/svg" aria-hidden="true">
        <g transform="translate(6,6)">
          <ellipse cx="50" cy="110" rx="40" ry="12" fill="#d9c7b3" />
          <path d="M20 90 C18 70 36 40 54 40 C72 40 90 70 88 90 Z" fill="#7f5b46" opacity="0.15" />
          <path d="M10 82 C18 36 60 18 95 62 C80 20 32 18 10 82 Z" fill="#9b6b4f" />
          <ellipse cx="58" cy="48" rx="48" ry="28" fill="#e9d6c6" />
          <circle cx="42" cy="46" r="4" fill="#c18a6b" />
          <circle cx="76" cy="46" r="3" fill="#c18a6b" />
          <rect x="48" y="80" width="18" height="30" rx="6" fill="#f6efe8" transform="rotate(-6 57 95)"/>
        </g>
      </svg>
    </div>

    <div class="corner bottom-left">
      <svg viewBox="0 0 120 150" xmlns="http://www.w3.org/2000/svg" aria-hidden="true">
        <g transform="translate(6,6)">
          <ellipse cx="50" cy="110" rx="40" ry="12" fill="#d9c7b3" />
          <path d="M20 90 C18 70 36 40 54 40 C72 40 90 70 88 90 Z" fill="#7f5b46" opacity="0.15" />
          <path d="M10 82 C18 36 60 18 95 62 C80 20 32 18 10 82 Z" fill="#9b6b4f" />
          <ellipse cx="58" cy="48" rx="48" ry="28" fill="#e9d6c6" />
          <circle cx="42" cy="46" r="4" fill="#c18a6b" />
          <circle cx="76" cy="46" r="3" fill="#c18a6b" />
          <rect x="48" y="80" width="18" height="30" rx="6" fill="#f6efe8" transform="rotate(-6 57 95)"/>
        </g>
      </svg>
    </div>

    <div class="corner bottom-right">
      <svg viewBox="0 0 120 150" xmlns="http://www.w3.org/2000/svg" aria-hidden="true">
        <g transform="translate(6,6)">
          <ellipse cx="50" cy="110" rx="40" ry="12" fill="#d9c7b3" />
          <path d="M20 90 C18 70 36 40 54 40 C72 40 90 70 88 90 Z" fill="#7f5b46" opacity="0.15" />
          <path d="M10 82 C18 36 60 18 95 62 C80 20 32 18 10 82 Z" fill="#9b6b4f" />
          <ellipse cx="58" cy="48" rx="48" ry="28" fill="#e9d6c6" />
          <circle cx="42" cy="46" r="4" fill="#c18a6b" />
          <circle cx="76" cy="46" r="3" fill="#c18a6b" />
          <rect x="48" y="80" width="18" height="30" rx="6" fill="#f6efe8" transform="rotate(-6 57 95)"/>
        </g>
      </svg>
    </div>

    <!-- hongos estilo Mario pequeños -->
    <div class="mario-edge m1"> 
      <svg viewBox="0 0 64 64" xmlns="http://www.w3.org/2000/svg" aria-hidden="true">
        <g>
          <ellipse cx="32" cy="44" rx="16" ry="8" fill="#d9c7b3"/>
          <path d="M12 36 C12 24 20 18 32 18 C44 18 52 24 52 36 Z" fill="#d22d2d"/>
          <circle cx="24" cy="30" r="3" fill="#fff"/>
          <circle cx="34" cy="26" r="2.5" fill="#fff"/>
          <circle cx="42" cy="30" r="2" fill="#fff"/>
        </g>
      </svg>
    </div>

    <div class="mario-edge m2"> 
      <svg viewBox="0 0 64 64" xmlns="http://www.w3.org/2000/svg" aria-hidden="true">
        <g>
          <ellipse cx="32" cy="44" rx="16" ry="8" fill="#d9c7b3"/>
          <path d="M12 36 C12 24 20 18 32 18 C44 18 52 24 52 36 Z" fill="#d22d2d"/>
          <circle cx="24" cy="30" r="3" fill="#fff"/>
          <circle cx="34" cy="26" r="2.5" fill="#fff"/>
          <circle cx="42" cy="30" r="2" fill="#fff"/>
        </g>
      </svg>
    </div>

    <div class="mario-edge m3"> 
      <svg viewBox="0 0 64 64" xmlns="http://www.w3.org/2000/svg" aria-hidden="true">
        <g>
          <ellipse cx="32" cy="44" rx="16" ry="8" fill="#d9c7b3"/>
          <path d="M12 36 C12 24 20 18 32 18 C44 18 52 24 52 36 Z" fill="#d22d2d"/>
          <circle cx="24" cy="30" r="3" fill="#fff"/>
          <circle cx="34" cy="26" r="2.5" fill="#fff"/>
          <circle cx="42" cy="30" r="2" fill="#fff"/>
        </g>
      </svg>
    </div>

    <div class="mario-edge m4"> 
      <svg viewBox="0 0 64 64" xmlns="http://www.w3.org/2000/svg" aria-hidden="true">
        <g>
          <ellipse cx="32" cy="44" rx="16" ry="8" fill="#d9c7b3"/>
          <path d="M12 36 C12 24 20 18 32 18 C44 18 52 24 52 36 Z" fill="#d22d2d"/>
          <circle cx="24" cy="30" r="3" fill="#fff"/>
          <circle cx="34" cy="26" r="2.5" fill="#fff"/>
          <circle cx="42" cy="30" r="2" fill="#fff"/>
        </g>
      </svg>
    </div>

    <!-- Contenido principal -->
    <div class="content">
      <div class="subtitle">Ejercicios guiados y prácticos</div>
      <div class="title">ESTRUCTURA DE DATOS</div>

      <div class="name">Sara Lizbet Serna Rodriguez</div>
      <div class="group">Grupo: GTID141</div>
    </div>

  </div>
</body>
</html>

