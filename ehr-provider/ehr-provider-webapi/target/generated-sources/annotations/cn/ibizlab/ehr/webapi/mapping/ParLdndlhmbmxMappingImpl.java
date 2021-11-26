package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParLdndlhmbmx;
import cn.ibizlab.ehr.webapi.dto.ParLdndlhmbmxDTO;
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
public class ParLdndlhmbmxMappingImpl implements ParLdndlhmbmxMapping {

    @Override
    public ParLdndlhmbmx toDomain(ParLdndlhmbmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParLdndlhmbmx parLdndlhmbmx = new ParLdndlhmbmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parLdndlhmbmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parLdndlhmbmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getMblx() != null ) {
            parLdndlhmbmx.setMblx( dto.getMblx() );
        }
        if ( dto.getWcqk() != null ) {
            parLdndlhmbmx.setWcqk( dto.getWcqk() );
        }
        if ( dto.getParldndlhmbmxname() != null ) {
            parLdndlhmbmx.setParldndlhmbmxname( dto.getParldndlhmbmxname() );
        }
        if ( dto.getXgrz() != null ) {
            parLdndlhmbmx.setXgrz( dto.getXgrz() );
        }
        if ( dto.getZpfs() != null ) {
            parLdndlhmbmx.setZpfs( dto.getZpfs() );
        }
        if ( dto.getKhbf() != null ) {
            parLdndlhmbmx.setKhbf( dto.getKhbf() );
        }
        if ( dto.getJzszpsfs() != null ) {
            parLdndlhmbmx.setJzszpsfs( dto.getJzszpsfs() );
        }
        if ( dto.getFgldpf() != null ) {
            parLdndlhmbmx.setFgldpf( dto.getFgldpf() );
        }
        if ( dto.getZt() != null ) {
            parLdndlhmbmx.setZt( dto.getZt() );
        }
        if ( dto.getSpzt() != null ) {
            parLdndlhmbmx.setSpzt( dto.getSpzt() );
        }
        if ( dto.getFz() != null ) {
            parLdndlhmbmx.setFz( dto.getFz() );
        }
        if ( dto.getZmcl() != null ) {
            parLdndlhmbmx.setZmcl( dto.getZmcl() );
        }
        if ( dto.getMblhyq() != null ) {
            parLdndlhmbmx.setMblhyq( dto.getMblhyq() );
        }
        if ( dto.getParldndlhmbid() != null ) {
            parLdndlhmbmx.setParldndlhmbid( dto.getParldndlhmbid() );
        }
        if ( dto.getUpdatedate() != null ) {
            parLdndlhmbmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            parLdndlhmbmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getParldndlhmbmxid() != null ) {
            parLdndlhmbmx.setParldndlhmbmxid( dto.getParldndlhmbmxid() );
        }
        if ( dto.getCreateman() != null ) {
            parLdndlhmbmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            parLdndlhmbmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getParldndlhmbname() != null ) {
            parLdndlhmbmx.setParldndlhmbname( dto.getParldndlhmbname() );
        }

        return parLdndlhmbmx;
    }

    @Override
    public ParLdndlhmbmxDTO toDto(ParLdndlhmbmx entity) {
        if ( entity == null ) {
            return null;
        }

        ParLdndlhmbmxDTO parLdndlhmbmxDTO = new ParLdndlhmbmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parLdndlhmbmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parLdndlhmbmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getMblx() != null ) {
            parLdndlhmbmxDTO.setMblx( entity.getMblx() );
        }
        if ( entity.getWcqk() != null ) {
            parLdndlhmbmxDTO.setWcqk( entity.getWcqk() );
        }
        if ( entity.getParldndlhmbmxname() != null ) {
            parLdndlhmbmxDTO.setParldndlhmbmxname( entity.getParldndlhmbmxname() );
        }
        if ( entity.getXgrz() != null ) {
            parLdndlhmbmxDTO.setXgrz( entity.getXgrz() );
        }
        if ( entity.getZpfs() != null ) {
            parLdndlhmbmxDTO.setZpfs( entity.getZpfs() );
        }
        if ( entity.getKhbf() != null ) {
            parLdndlhmbmxDTO.setKhbf( entity.getKhbf() );
        }
        if ( entity.getJzszpsfs() != null ) {
            parLdndlhmbmxDTO.setJzszpsfs( entity.getJzszpsfs() );
        }
        if ( entity.getFgldpf() != null ) {
            parLdndlhmbmxDTO.setFgldpf( entity.getFgldpf() );
        }
        if ( entity.getZt() != null ) {
            parLdndlhmbmxDTO.setZt( entity.getZt() );
        }
        if ( entity.getSpzt() != null ) {
            parLdndlhmbmxDTO.setSpzt( entity.getSpzt() );
        }
        if ( entity.getFz() != null ) {
            parLdndlhmbmxDTO.setFz( entity.getFz() );
        }
        if ( entity.getZmcl() != null ) {
            parLdndlhmbmxDTO.setZmcl( entity.getZmcl() );
        }
        if ( entity.getMblhyq() != null ) {
            parLdndlhmbmxDTO.setMblhyq( entity.getMblhyq() );
        }
        if ( entity.getParldndlhmbid() != null ) {
            parLdndlhmbmxDTO.setParldndlhmbid( entity.getParldndlhmbid() );
        }
        if ( entity.getUpdatedate() != null ) {
            parLdndlhmbmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            parLdndlhmbmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getParldndlhmbmxid() != null ) {
            parLdndlhmbmxDTO.setParldndlhmbmxid( entity.getParldndlhmbmxid() );
        }
        if ( entity.getCreateman() != null ) {
            parLdndlhmbmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            parLdndlhmbmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getParldndlhmbname() != null ) {
            parLdndlhmbmxDTO.setParldndlhmbname( entity.getParldndlhmbname() );
        }

        return parLdndlhmbmxDTO;
    }

    @Override
    public List<ParLdndlhmbmx> toDomain(List<ParLdndlhmbmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParLdndlhmbmx> list = new ArrayList<ParLdndlhmbmx>( dtoList.size() );
        for ( ParLdndlhmbmxDTO parLdndlhmbmxDTO : dtoList ) {
            list.add( toDomain( parLdndlhmbmxDTO ) );
        }

        return list;
    }

    @Override
    public List<ParLdndlhmbmxDTO> toDto(List<ParLdndlhmbmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParLdndlhmbmxDTO> list = new ArrayList<ParLdndlhmbmxDTO>( entityList.size() );
        for ( ParLdndlhmbmx parLdndlhmbmx : entityList ) {
            list.add( toDto( parLdndlhmbmx ) );
        }

        return list;
    }
}
