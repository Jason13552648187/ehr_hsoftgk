package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParYdgzjhmx;
import cn.ibizlab.ehr.webapi.dto.ParYdgzjhmxDTO;
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
    date = "2021-09-04T00:31:56+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class ParYdgzjhmxMappingImpl implements ParYdgzjhmxMapping {

    @Override
    public ParYdgzjhmx toDomain(ParYdgzjhmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParYdgzjhmx parYdgzjhmx = new ParYdgzjhmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parYdgzjhmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parYdgzjhmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getWcbz() != null ) {
            parYdgzjhmx.setWcbz( dto.getWcbz() );
        }
        if ( dto.getXh() != null ) {
            parYdgzjhmx.setXh( dto.getXh() );
        }
        if ( dto.getQz() != null ) {
            parYdgzjhmx.setQz( dto.getQz() );
        }
        if ( dto.getZppf() != null ) {
            parYdgzjhmx.setZppf( dto.getZppf() );
        }
        if ( dto.getWcqk() != null ) {
            parYdgzjhmx.setWcqk( dto.getWcqk() );
        }
        if ( dto.getXzhtjgzjh() != null ) {
            parYdgzjhmx.setXzhtjgzjh( dto.getXzhtjgzjh() );
        }
        if ( dto.getZblx() != null ) {
            parYdgzjhmx.setZblx( dto.getZblx() );
        }
        if ( dto.getNwcrq() != null ) {
            parYdgzjhmx.setNwcrq( dto.getNwcrq() );
        }
        if ( dto.getParydgzjhmxname() != null ) {
            parYdgzjhmx.setParydgzjhmxname( dto.getParydgzjhmxname() );
        }
        if ( dto.getParydgzjhid() != null ) {
            parYdgzjhmx.setParydgzjhid( dto.getParydgzjhid() );
        }
        if ( dto.getCreatedate() != null ) {
            parYdgzjhmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            parYdgzjhmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            parYdgzjhmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getParydgzjhmxid() != null ) {
            parYdgzjhmx.setParydgzjhmxid( dto.getParydgzjhmxid() );
        }
        if ( dto.getUpdateman() != null ) {
            parYdgzjhmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getParydgzjhname() != null ) {
            parYdgzjhmx.setParydgzjhname( dto.getParydgzjhname() );
        }

        return parYdgzjhmx;
    }

    @Override
    public ParYdgzjhmxDTO toDto(ParYdgzjhmx entity) {
        if ( entity == null ) {
            return null;
        }

        ParYdgzjhmxDTO parYdgzjhmxDTO = new ParYdgzjhmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parYdgzjhmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parYdgzjhmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getWcbz() != null ) {
            parYdgzjhmxDTO.setWcbz( entity.getWcbz() );
        }
        if ( entity.getXh() != null ) {
            parYdgzjhmxDTO.setXh( entity.getXh() );
        }
        if ( entity.getQz() != null ) {
            parYdgzjhmxDTO.setQz( entity.getQz() );
        }
        if ( entity.getZppf() != null ) {
            parYdgzjhmxDTO.setZppf( entity.getZppf() );
        }
        if ( entity.getWcqk() != null ) {
            parYdgzjhmxDTO.setWcqk( entity.getWcqk() );
        }
        if ( entity.getXzhtjgzjh() != null ) {
            parYdgzjhmxDTO.setXzhtjgzjh( entity.getXzhtjgzjh() );
        }
        if ( entity.getZblx() != null ) {
            parYdgzjhmxDTO.setZblx( entity.getZblx() );
        }
        if ( entity.getNwcrq() != null ) {
            parYdgzjhmxDTO.setNwcrq( entity.getNwcrq() );
        }
        if ( entity.getParydgzjhmxname() != null ) {
            parYdgzjhmxDTO.setParydgzjhmxname( entity.getParydgzjhmxname() );
        }
        if ( entity.getParydgzjhid() != null ) {
            parYdgzjhmxDTO.setParydgzjhid( entity.getParydgzjhid() );
        }
        if ( entity.getCreatedate() != null ) {
            parYdgzjhmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            parYdgzjhmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            parYdgzjhmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getParydgzjhmxid() != null ) {
            parYdgzjhmxDTO.setParydgzjhmxid( entity.getParydgzjhmxid() );
        }
        if ( entity.getUpdateman() != null ) {
            parYdgzjhmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getParydgzjhname() != null ) {
            parYdgzjhmxDTO.setParydgzjhname( entity.getParydgzjhname() );
        }

        return parYdgzjhmxDTO;
    }

    @Override
    public List<ParYdgzjhmx> toDomain(List<ParYdgzjhmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParYdgzjhmx> list = new ArrayList<ParYdgzjhmx>( dtoList.size() );
        for ( ParYdgzjhmxDTO parYdgzjhmxDTO : dtoList ) {
            list.add( toDomain( parYdgzjhmxDTO ) );
        }

        return list;
    }

    @Override
    public List<ParYdgzjhmxDTO> toDto(List<ParYdgzjhmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParYdgzjhmxDTO> list = new ArrayList<ParYdgzjhmxDTO>( entityList.size() );
        for ( ParYdgzjhmx parYdgzjhmx : entityList ) {
            list.add( toDto( parYdgzjhmx ) );
        }

        return list;
    }
}
