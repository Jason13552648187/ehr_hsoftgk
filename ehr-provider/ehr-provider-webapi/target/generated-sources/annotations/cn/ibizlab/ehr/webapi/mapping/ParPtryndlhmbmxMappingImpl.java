package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParPtryndlhmbmx;
import cn.ibizlab.ehr.webapi.dto.ParPtryndlhmbmxDTO;
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
public class ParPtryndlhmbmxMappingImpl implements ParPtryndlhmbmxMapping {

    @Override
    public ParPtryndlhmbmx toDomain(ParPtryndlhmbmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParPtryndlhmbmx parPtryndlhmbmx = new ParPtryndlhmbmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parPtryndlhmbmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parPtryndlhmbmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getFzqz() != null ) {
            parPtryndlhmbmx.setFzqz( dto.getFzqz() );
        }
        if ( dto.getSpzt() != null ) {
            parPtryndlhmbmx.setSpzt( dto.getSpzt() );
        }
        if ( dto.getXh() != null ) {
            parPtryndlhmbmx.setXh( dto.getXh() );
        }
        if ( dto.getKhzq() != null ) {
            parPtryndlhmbmx.setKhzq( dto.getKhzq() );
        }
        if ( dto.getWcqk() != null ) {
            parPtryndlhmbmx.setWcqk( dto.getWcqk() );
        }
        if ( dto.getZpfs() != null ) {
            parPtryndlhmbmx.setZpfs( dto.getZpfs() );
        }
        if ( dto.getParptryndlhmbmxname() != null ) {
            parPtryndlhmbmx.setParptryndlhmbmxname( dto.getParptryndlhmbmxname() );
        }
        if ( dto.getZzydms() != null ) {
            parPtryndlhmbmx.setZzydms( dto.getZzydms() );
        }
        if ( dto.getXgrz() != null ) {
            parPtryndlhmbmx.setXgrz( dto.getXgrz() );
        }
        if ( dto.getZmcl() != null ) {
            parPtryndlhmbmx.setZmcl( dto.getZmcl() );
        }
        if ( dto.getZt() != null ) {
            parPtryndlhmbmx.setZt( dto.getZt() );
        }
        if ( dto.getKhbz() != null ) {
            parPtryndlhmbmx.setKhbz( dto.getKhbz() );
        }
        if ( dto.getParptryndlhmbid() != null ) {
            parPtryndlhmbmx.setParptryndlhmbid( dto.getParptryndlhmbid() );
        }
        if ( dto.getCreateman() != null ) {
            parPtryndlhmbmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            parPtryndlhmbmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            parPtryndlhmbmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getParptryndlhmbmxid() != null ) {
            parPtryndlhmbmx.setParptryndlhmbmxid( dto.getParptryndlhmbmxid() );
        }
        if ( dto.getUpdateman() != null ) {
            parPtryndlhmbmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getParptryndlhmbname() != null ) {
            parPtryndlhmbmx.setParptryndlhmbname( dto.getParptryndlhmbname() );
        }

        return parPtryndlhmbmx;
    }

    @Override
    public ParPtryndlhmbmxDTO toDto(ParPtryndlhmbmx entity) {
        if ( entity == null ) {
            return null;
        }

        ParPtryndlhmbmxDTO parPtryndlhmbmxDTO = new ParPtryndlhmbmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parPtryndlhmbmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parPtryndlhmbmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getFzqz() != null ) {
            parPtryndlhmbmxDTO.setFzqz( entity.getFzqz() );
        }
        if ( entity.getSpzt() != null ) {
            parPtryndlhmbmxDTO.setSpzt( entity.getSpzt() );
        }
        if ( entity.getXh() != null ) {
            parPtryndlhmbmxDTO.setXh( entity.getXh() );
        }
        if ( entity.getKhzq() != null ) {
            parPtryndlhmbmxDTO.setKhzq( entity.getKhzq() );
        }
        if ( entity.getWcqk() != null ) {
            parPtryndlhmbmxDTO.setWcqk( entity.getWcqk() );
        }
        if ( entity.getZpfs() != null ) {
            parPtryndlhmbmxDTO.setZpfs( entity.getZpfs() );
        }
        if ( entity.getParptryndlhmbmxname() != null ) {
            parPtryndlhmbmxDTO.setParptryndlhmbmxname( entity.getParptryndlhmbmxname() );
        }
        if ( entity.getZzydms() != null ) {
            parPtryndlhmbmxDTO.setZzydms( entity.getZzydms() );
        }
        if ( entity.getXgrz() != null ) {
            parPtryndlhmbmxDTO.setXgrz( entity.getXgrz() );
        }
        if ( entity.getZmcl() != null ) {
            parPtryndlhmbmxDTO.setZmcl( entity.getZmcl() );
        }
        if ( entity.getZt() != null ) {
            parPtryndlhmbmxDTO.setZt( entity.getZt() );
        }
        if ( entity.getKhbz() != null ) {
            parPtryndlhmbmxDTO.setKhbz( entity.getKhbz() );
        }
        if ( entity.getParptryndlhmbid() != null ) {
            parPtryndlhmbmxDTO.setParptryndlhmbid( entity.getParptryndlhmbid() );
        }
        if ( entity.getCreateman() != null ) {
            parPtryndlhmbmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            parPtryndlhmbmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            parPtryndlhmbmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getParptryndlhmbmxid() != null ) {
            parPtryndlhmbmxDTO.setParptryndlhmbmxid( entity.getParptryndlhmbmxid() );
        }
        if ( entity.getUpdateman() != null ) {
            parPtryndlhmbmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getParptryndlhmbname() != null ) {
            parPtryndlhmbmxDTO.setParptryndlhmbname( entity.getParptryndlhmbname() );
        }

        return parPtryndlhmbmxDTO;
    }

    @Override
    public List<ParPtryndlhmbmx> toDomain(List<ParPtryndlhmbmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParPtryndlhmbmx> list = new ArrayList<ParPtryndlhmbmx>( dtoList.size() );
        for ( ParPtryndlhmbmxDTO parPtryndlhmbmxDTO : dtoList ) {
            list.add( toDomain( parPtryndlhmbmxDTO ) );
        }

        return list;
    }

    @Override
    public List<ParPtryndlhmbmxDTO> toDto(List<ParPtryndlhmbmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParPtryndlhmbmxDTO> list = new ArrayList<ParPtryndlhmbmxDTO>( entityList.size() );
        for ( ParPtryndlhmbmx parPtryndlhmbmx : entityList ) {
            list.add( toDto( parPtryndlhmbmx ) );
        }

        return list;
    }
}
