package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmZpmegl;
import cn.ibizlab.ehr.webapi.dto.PcmZpmeglDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmZpmeglMappingImpl implements PcmZpmeglMapping {

    @Override
    public PcmZpmegl toDomain(PcmZpmeglDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmZpmegl pcmZpmegl = new PcmZpmegl();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmZpmegl.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmZpmegl.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getNd() != null ) {
            pcmZpmegl.setNd( dto.getNd() );
        }
        if ( dto.getPcmzpmeglname() != null ) {
            pcmZpmegl.setPcmzpmeglname( dto.getPcmzpmeglname() );
        }
        if ( dto.getXh() != null ) {
            pcmZpmegl.setXh( dto.getXh() );
        }
        if ( dto.getXyzpbme() != null ) {
            pcmZpmegl.setXyzpbme( dto.getXyzpbme() );
        }
        if ( dto.getYbdrsSzjhw() != null ) {
            pcmZpmegl.setYbdrsSzjhw( dto.getYbdrsSzjhw() );
        }
        if ( dto.getYbdrsXzxzy() != null ) {
            pcmZpmegl.setYbdrsXzxzy( dto.getYbdrsXzxzy() );
        }
        if ( dto.getFpmeSzb() != null ) {
            pcmZpmegl.setFpmeSzb( dto.getFpmeSzb() );
        }
        if ( dto.getShzpyme() != null ) {
            pcmZpmegl.setShzpyme( dto.getShzpyme() );
        }
        if ( dto.getYbdrsXza() != null ) {
            pcmZpmegl.setYbdrsXza( dto.getYbdrsXza() );
        }
        if ( dto.getFpmeSzjhw() != null ) {
            pcmZpmegl.setFpmeSzjhw( dto.getFpmeSzjhw() );
        }
        if ( dto.getYbdrsSzb() != null ) {
            pcmZpmegl.setYbdrsSzb( dto.getYbdrsSzb() );
        }
        if ( dto.getShzpbme() != null ) {
            pcmZpmegl.setShzpbme( dto.getShzpbme() );
        }
        if ( dto.getFpmeXzxzy() != null ) {
            pcmZpmegl.setFpmeXzxzy( dto.getFpmeXzxzy() );
        }
        if ( dto.getShzpjhwme() != null ) {
            pcmZpmegl.setShzpjhwme( dto.getShzpjhwme() );
        }
        if ( dto.getPfcs() != null ) {
            pcmZpmegl.setPfcs( dto.getPfcs() );
        }
        if ( dto.getFpmeSzy() != null ) {
            pcmZpmegl.setFpmeSzy( dto.getFpmeSzy() );
        }
        if ( dto.getXyzpame() != null ) {
            pcmZpmegl.setXyzpame( dto.getXyzpame() );
        }
        if ( dto.getXyzpxzyme() != null ) {
            pcmZpmegl.setXyzpxzyme( dto.getXyzpxzyme() );
        }
        if ( dto.getFpmeXzb() != null ) {
            pcmZpmegl.setFpmeXzb( dto.getFpmeXzb() );
        }
        if ( dto.getYbdrsSza() != null ) {
            pcmZpmegl.setYbdrsSza( dto.getYbdrsSza() );
        }
        if ( dto.getFpmeXza() != null ) {
            pcmZpmegl.setFpmeXza( dto.getFpmeXza() );
        }
        if ( dto.getYbdrsXzb() != null ) {
            pcmZpmegl.setYbdrsXzb( dto.getYbdrsXzb() );
        }
        if ( dto.getFpmeSza() != null ) {
            pcmZpmegl.setFpmeSza( dto.getFpmeSza() );
        }
        if ( dto.getYbdrsSzy() != null ) {
            pcmZpmegl.setYbdrsSzy( dto.getYbdrsSzy() );
        }
        if ( dto.getShzpame() != null ) {
            pcmZpmegl.setShzpame( dto.getShzpame() );
        }
        if ( dto.getOrmorgid() != null ) {
            pcmZpmegl.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getOrgid() != null ) {
            pcmZpmegl.setOrgid( dto.getOrgid() );
        }
        if ( dto.getSfceSzy() != null ) {
            pcmZpmegl.setSfceSzy( dto.getSfceSzy() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmZpmegl.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getSfceXza() != null ) {
            pcmZpmegl.setSfceXza( dto.getSfceXza() );
        }
        if ( dto.getSfceSzb() != null ) {
            pcmZpmegl.setSfceSzb( dto.getSfceSzb() );
        }
        if ( dto.getCreateman() != null ) {
            pcmZpmegl.setCreateman( dto.getCreateman() );
        }
        if ( dto.getSfceSzjhw() != null ) {
            pcmZpmegl.setSfceSzjhw( dto.getSfceSzjhw() );
        }
        if ( dto.getPcmzpmeglid() != null ) {
            pcmZpmegl.setPcmzpmeglid( dto.getPcmzpmeglid() );
        }
        if ( dto.getSfceSza() != null ) {
            pcmZpmegl.setSfceSza( dto.getSfceSza() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmZpmegl.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getSfceXzb() != null ) {
            pcmZpmegl.setSfceXzb( dto.getSfceXzb() );
        }
        if ( dto.getSfceXzxzy() != null ) {
            pcmZpmegl.setSfceXzxzy( dto.getSfceXzxzy() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmZpmegl.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getZzdzs() != null ) {
            pcmZpmegl.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getOrmorgname() != null ) {
            pcmZpmegl.setOrmorgname( dto.getOrmorgname() );
        }

        return pcmZpmegl;
    }

    @Override
    public PcmZpmeglDTO toDto(PcmZpmegl entity) {
        if ( entity == null ) {
            return null;
        }

        PcmZpmeglDTO pcmZpmeglDTO = new PcmZpmeglDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmZpmeglDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmZpmeglDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getNd() != null ) {
            pcmZpmeglDTO.setNd( entity.getNd() );
        }
        if ( entity.getPcmzpmeglname() != null ) {
            pcmZpmeglDTO.setPcmzpmeglname( entity.getPcmzpmeglname() );
        }
        if ( entity.getXh() != null ) {
            pcmZpmeglDTO.setXh( entity.getXh() );
        }
        if ( entity.getXyzpbme() != null ) {
            pcmZpmeglDTO.setXyzpbme( entity.getXyzpbme() );
        }
        if ( entity.getYbdrsSzjhw() != null ) {
            pcmZpmeglDTO.setYbdrsSzjhw( entity.getYbdrsSzjhw() );
        }
        if ( entity.getYbdrsXzxzy() != null ) {
            pcmZpmeglDTO.setYbdrsXzxzy( entity.getYbdrsXzxzy() );
        }
        if ( entity.getFpmeSzb() != null ) {
            pcmZpmeglDTO.setFpmeSzb( entity.getFpmeSzb() );
        }
        if ( entity.getShzpyme() != null ) {
            pcmZpmeglDTO.setShzpyme( entity.getShzpyme() );
        }
        if ( entity.getYbdrsXza() != null ) {
            pcmZpmeglDTO.setYbdrsXza( entity.getYbdrsXza() );
        }
        if ( entity.getFpmeSzjhw() != null ) {
            pcmZpmeglDTO.setFpmeSzjhw( entity.getFpmeSzjhw() );
        }
        if ( entity.getYbdrsSzb() != null ) {
            pcmZpmeglDTO.setYbdrsSzb( entity.getYbdrsSzb() );
        }
        if ( entity.getShzpbme() != null ) {
            pcmZpmeglDTO.setShzpbme( entity.getShzpbme() );
        }
        if ( entity.getFpmeXzxzy() != null ) {
            pcmZpmeglDTO.setFpmeXzxzy( entity.getFpmeXzxzy() );
        }
        if ( entity.getShzpjhwme() != null ) {
            pcmZpmeglDTO.setShzpjhwme( entity.getShzpjhwme() );
        }
        if ( entity.getPfcs() != null ) {
            pcmZpmeglDTO.setPfcs( entity.getPfcs() );
        }
        if ( entity.getFpmeSzy() != null ) {
            pcmZpmeglDTO.setFpmeSzy( entity.getFpmeSzy() );
        }
        if ( entity.getXyzpame() != null ) {
            pcmZpmeglDTO.setXyzpame( entity.getXyzpame() );
        }
        if ( entity.getXyzpxzyme() != null ) {
            pcmZpmeglDTO.setXyzpxzyme( entity.getXyzpxzyme() );
        }
        if ( entity.getFpmeXzb() != null ) {
            pcmZpmeglDTO.setFpmeXzb( entity.getFpmeXzb() );
        }
        if ( entity.getYbdrsSza() != null ) {
            pcmZpmeglDTO.setYbdrsSza( entity.getYbdrsSza() );
        }
        if ( entity.getFpmeXza() != null ) {
            pcmZpmeglDTO.setFpmeXza( entity.getFpmeXza() );
        }
        if ( entity.getYbdrsXzb() != null ) {
            pcmZpmeglDTO.setYbdrsXzb( entity.getYbdrsXzb() );
        }
        if ( entity.getFpmeSza() != null ) {
            pcmZpmeglDTO.setFpmeSza( entity.getFpmeSza() );
        }
        if ( entity.getYbdrsSzy() != null ) {
            pcmZpmeglDTO.setYbdrsSzy( entity.getYbdrsSzy() );
        }
        if ( entity.getShzpame() != null ) {
            pcmZpmeglDTO.setShzpame( entity.getShzpame() );
        }
        if ( entity.getOrmorgid() != null ) {
            pcmZpmeglDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getOrgid() != null ) {
            pcmZpmeglDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getSfceSzy() != null ) {
            pcmZpmeglDTO.setSfceSzy( entity.getSfceSzy() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmZpmeglDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getSfceXza() != null ) {
            pcmZpmeglDTO.setSfceXza( entity.getSfceXza() );
        }
        if ( entity.getSfceSzb() != null ) {
            pcmZpmeglDTO.setSfceSzb( entity.getSfceSzb() );
        }
        if ( entity.getCreateman() != null ) {
            pcmZpmeglDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getSfceSzjhw() != null ) {
            pcmZpmeglDTO.setSfceSzjhw( entity.getSfceSzjhw() );
        }
        if ( entity.getPcmzpmeglid() != null ) {
            pcmZpmeglDTO.setPcmzpmeglid( entity.getPcmzpmeglid() );
        }
        if ( entity.getSfceSza() != null ) {
            pcmZpmeglDTO.setSfceSza( entity.getSfceSza() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmZpmeglDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getSfceXzb() != null ) {
            pcmZpmeglDTO.setSfceXzb( entity.getSfceXzb() );
        }
        if ( entity.getSfceXzxzy() != null ) {
            pcmZpmeglDTO.setSfceXzxzy( entity.getSfceXzxzy() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmZpmeglDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getZzdzs() != null ) {
            pcmZpmeglDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getOrmorgname() != null ) {
            pcmZpmeglDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return pcmZpmeglDTO;
    }

    @Override
    public List<PcmZpmegl> toDomain(List<PcmZpmeglDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmZpmegl> list = new ArrayList<PcmZpmegl>( dtoList.size() );
        for ( PcmZpmeglDTO pcmZpmeglDTO : dtoList ) {
            list.add( toDomain( pcmZpmeglDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmZpmeglDTO> toDto(List<PcmZpmegl> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmZpmeglDTO> list = new ArrayList<PcmZpmeglDTO>( entityList.size() );
        for ( PcmZpmegl pcmZpmegl : entityList ) {
            list.add( toDto( pcmZpmegl ) );
        }

        return list;
    }
}
