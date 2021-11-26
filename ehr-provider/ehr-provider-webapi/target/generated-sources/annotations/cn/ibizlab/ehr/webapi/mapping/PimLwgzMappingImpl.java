package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimLwgz;
import cn.ibizlab.ehr.webapi.dto.PimLwgzDTO;
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
public class PimLwgzMappingImpl implements PimLwgzMapping {

    @Override
    public PimLwgz toDomain(PimLwgzDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimLwgz pimLwgz = new PimLwgz();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimLwgz.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimLwgz.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPimlwgzname() != null ) {
            pimLwgz.setPimlwgzname( dto.getPimlwgzname() );
        }
        if ( dto.getEnable() != null ) {
            pimLwgz.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdateman() != null ) {
            pimLwgz.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            pimLwgz.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimLwgz.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPimlwgzid() != null ) {
            pimLwgz.setPimlwgzid( dto.getPimlwgzid() );
        }
        if ( dto.getCreatedate() != null ) {
            pimLwgz.setCreatedate( dto.getCreatedate() );
        }

        return pimLwgz;
    }

    @Override
    public PimLwgzDTO toDto(PimLwgz entity) {
        if ( entity == null ) {
            return null;
        }

        PimLwgzDTO pimLwgzDTO = new PimLwgzDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimLwgzDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimLwgzDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPimlwgzname() != null ) {
            pimLwgzDTO.setPimlwgzname( entity.getPimlwgzname() );
        }
        if ( entity.getEnable() != null ) {
            pimLwgzDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdateman() != null ) {
            pimLwgzDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            pimLwgzDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimLwgzDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPimlwgzid() != null ) {
            pimLwgzDTO.setPimlwgzid( entity.getPimlwgzid() );
        }
        if ( entity.getCreatedate() != null ) {
            pimLwgzDTO.setCreatedate( entity.getCreatedate() );
        }

        return pimLwgzDTO;
    }

    @Override
    public List<PimLwgz> toDomain(List<PimLwgzDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimLwgz> list = new ArrayList<PimLwgz>( dtoList.size() );
        for ( PimLwgzDTO pimLwgzDTO : dtoList ) {
            list.add( toDomain( pimLwgzDTO ) );
        }

        return list;
    }

    @Override
    public List<PimLwgzDTO> toDto(List<PimLwgz> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimLwgzDTO> list = new ArrayList<PimLwgzDTO>( entityList.size() );
        for ( PimLwgz pimLwgz : entityList ) {
            list.add( toDto( pimLwgz ) );
        }

        return list;
    }
}
