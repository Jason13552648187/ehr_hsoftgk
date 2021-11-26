package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimVocationalCatalog;
import cn.ibizlab.ehr.webapi.dto.PimVocationalCatalogDTO;
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
public class PimVocationalCatalogMappingImpl implements PimVocationalCatalogMapping {

    @Override
    public PimVocationalCatalog toDomain(PimVocationalCatalogDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimVocationalCatalog pimVocationalCatalog = new PimVocationalCatalog();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimVocationalCatalog.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimVocationalCatalog.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getDh() != null ) {
            pimVocationalCatalog.setDh( dto.getDh() );
        }
        if ( dto.getPimvocationalcatalogname() != null ) {
            pimVocationalCatalog.setPimvocationalcatalogname( dto.getPimvocationalcatalogname() );
        }
        if ( dto.getPxh() != null ) {
            pimVocationalCatalog.setPxh( dto.getPxh() );
        }
        if ( dto.getCreateman() != null ) {
            pimVocationalCatalog.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pimVocationalCatalog.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimVocationalCatalog.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPimvocationalcatalogid() != null ) {
            pimVocationalCatalog.setPimvocationalcatalogid( dto.getPimvocationalcatalogid() );
        }
        if ( dto.getUpdateman() != null ) {
            pimVocationalCatalog.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getEnable() != null ) {
            pimVocationalCatalog.setEnable( dto.getEnable() );
        }

        return pimVocationalCatalog;
    }

    @Override
    public PimVocationalCatalogDTO toDto(PimVocationalCatalog entity) {
        if ( entity == null ) {
            return null;
        }

        PimVocationalCatalogDTO pimVocationalCatalogDTO = new PimVocationalCatalogDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimVocationalCatalogDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimVocationalCatalogDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getDh() != null ) {
            pimVocationalCatalogDTO.setDh( entity.getDh() );
        }
        if ( entity.getPimvocationalcatalogname() != null ) {
            pimVocationalCatalogDTO.setPimvocationalcatalogname( entity.getPimvocationalcatalogname() );
        }
        if ( entity.getPxh() != null ) {
            pimVocationalCatalogDTO.setPxh( entity.getPxh() );
        }
        if ( entity.getCreateman() != null ) {
            pimVocationalCatalogDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pimVocationalCatalogDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimVocationalCatalogDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPimvocationalcatalogid() != null ) {
            pimVocationalCatalogDTO.setPimvocationalcatalogid( entity.getPimvocationalcatalogid() );
        }
        if ( entity.getUpdateman() != null ) {
            pimVocationalCatalogDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getEnable() != null ) {
            pimVocationalCatalogDTO.setEnable( entity.getEnable() );
        }

        return pimVocationalCatalogDTO;
    }

    @Override
    public List<PimVocationalCatalog> toDomain(List<PimVocationalCatalogDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimVocationalCatalog> list = new ArrayList<PimVocationalCatalog>( dtoList.size() );
        for ( PimVocationalCatalogDTO pimVocationalCatalogDTO : dtoList ) {
            list.add( toDomain( pimVocationalCatalogDTO ) );
        }

        return list;
    }

    @Override
    public List<PimVocationalCatalogDTO> toDto(List<PimVocationalCatalog> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimVocationalCatalogDTO> list = new ArrayList<PimVocationalCatalogDTO>( entityList.size() );
        for ( PimVocationalCatalog pimVocationalCatalog : entityList ) {
            list.add( toDto( pimVocationalCatalog ) );
        }

        return list;
    }
}
