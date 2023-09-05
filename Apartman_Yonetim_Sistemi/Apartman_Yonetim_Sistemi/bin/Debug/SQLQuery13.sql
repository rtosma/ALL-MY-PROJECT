use apartman

/****** Object: Table [dbo].[yetki] Script Date: 25.02.2020 01:23:08 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[yetki](
[id] [int] IDENTITY(1,1) NOT NULL,
[tc] [nvarchar](50) NOT NULL,
[gelir_isleri] [tinyint] NULL,
[gider_isleri] [tinyint] NULL,
[kasa_isleri] [tinyint] NULL,
[borc_isleri] [tinyint] NULL,
[daire_isleri] [tinyint] NULL,
[kullanici_isleri] [tinyint] NULL,
CONSTRAINT [PK_yetki] PRIMARY KEY CLUSTERED
(
[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]) ON [PRIMARY]

GO