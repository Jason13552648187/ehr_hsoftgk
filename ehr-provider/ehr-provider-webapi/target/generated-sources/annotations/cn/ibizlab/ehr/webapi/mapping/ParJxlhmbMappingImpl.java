package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParJxlhmb;
import cn.ibizlab.ehr.webapi.dto.ParJxlhmbDTO;
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
    date = "2021-09-04T00:31:46+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class ParJxlhmbMappingImpl implements ParJxlhmbMapping {

    @Override
    public ParJxlhmb toDomain(ParJxlhmbDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParJxlhmb parJxlhmb = new ParJxlhmb();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parJxlhmb.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parJxlhmb.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getKhlx() != null ) {
            parJxlhmb.setKhlx( dto.getKhlx() );
        }
        if ( dto.getNd() != null ) {
            parJxlhmb.setNd( dto.getNd() );
        }
        if ( dto.getJssj() != null ) {
            parJxlhmb.setJssj( dto.getJssj() );
        }
        if ( dto.getKssj() != null ) {
            parJxlhmb.setKssj( dto.getKssj() );
        }
        if ( dto.getParjxlhmbname() != null ) {
            parJxlhmb.setParjxlhmbname( dto.getParjxlhmbname() );
        }
        if ( dto.getPimpersonid() != null ) {
            parJxlhmb.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getCreatedate() != null ) {
            parJxlhmb.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            parJxlhmb.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            parJxlhmb.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getParjxlhmbid() != null ) {
            parJxlhmb.setParjxlhmbid( dto.getParjxlhmbid() );
        }
        if ( dto.getUpdateman() != null ) {
            parJxlhmb.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPimpersonname() != null ) {
            parJxlhmb.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getBm() != null ) {
            parJxlhmb.setBm( dto.getBm() );
        }
        if ( dto.getZz() != null ) {
            parJxlhmb.setZz( dto.getZz() );
        }

        return parJxlhmb;
    }

    @Override
    public ParJxlhmbDTO toDto(ParJxlhmb entity) {
        if ( entity == null ) {
            return null;
        }

        ParJxlhmbDTO parJxlhmbDTO = new ParJxlhmbDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parJxlhmbDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parJxlhmbDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getKhlx() != null ) {
            parJxlhmbDTO.setKhlx( entity.getKhlx() );
        }
        if ( entity.getNd() != null ) {
            parJxlhmbDTO.setNd( entity.getNd() );
        }
        if ( entity.getJssj() != null ) {
            parJxlhmbDTO.setJssj( entity.getJssj() );
        }
        if ( entity.getKssj() != null ) {
            parJxlhmbDTO.setKssj( entity.getKssj() );
        }
        if ( entity.getParjxlhmbname() != null ) {
            parJxlhmbDTO.setParjxlhmbname( entity.getParjxlhmbname() );
        }
        if ( entity.getPimpersonid() != null ) {
            parJxlhmbDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getCreatedate() != null ) {
            parJxlhmbDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            parJxlhmbDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            parJxlhmbDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getParjxlhmbid() != null ) {
            parJxlhmbDTO.setParjxlhmbid( entity.getParjxlhmbid() );
        }
        if ( entity.getUpdateman() != null ) {
            parJxlhmbDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPimpersonname() != null ) {
            parJxlhmbDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getBm() != null ) {
            parJxlhmbDTO.setBm( entity.getBm() );
        }
        if ( entity.getZz() != null ) {
            parJxlhmbDTO.setZz( entity.getZz() );
        }

        return parJxlhmbDTO;
    }

    @Override
    public List<ParJxlhmb> toDomain(List<ParJxlhmbDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParJxlhmb> list = new ArrayList<ParJxlhmb>( dtoList.size() );
        for ( ParJxlhmbDTO parJxlhmbDTO : dtoList ) {
            list.add( toDomain( parJxlhmbDTO ) );
        }

        return list;
    }

    @Override
    public List<ParJxlhmbDTO> toDto(List<ParJxlhmb> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParJxlhmbDTO> list = new ArrayList<ParJxlhmbDTO>( entityList.size() );
        for ( ParJxlhmb parJxlhmb : entityList ) {
            list.add( toDto( parJxlhmb ) );
        }

        return list;
    }
}
