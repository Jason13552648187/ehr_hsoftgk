package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimArchivalCatalogue;
import cn.ibizlab.ehr.webapi.dto.PimArchivalCatalogueDTO;
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
    date = "2021-09-04T00:31:45+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimArchivalCatalogueMappingImpl implements PimArchivalCatalogueMapping {

    @Override
    public PimArchivalCatalogue toDomain(PimArchivalCatalogueDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimArchivalCatalogue pimArchivalCatalogue = new PimArchivalCatalogue();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimArchivalCatalogue.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimArchivalCatalogue.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSerialnumber() != null ) {
            pimArchivalCatalogue.setSerialnumber( dto.getSerialnumber() );
        }
        if ( dto.getArchivalcataloguename() != null ) {
            pimArchivalCatalogue.setArchivalcataloguename( dto.getArchivalcataloguename() );
        }
        if ( dto.getPimarchivesid() != null ) {
            pimArchivalCatalogue.setPimarchivesid( dto.getPimarchivesid() );
        }
        if ( dto.getEnable() != null ) {
            pimArchivalCatalogue.setEnable( dto.getEnable() );
        }
        if ( dto.getCreatedate() != null ) {
            pimArchivalCatalogue.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimArchivalCatalogue.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pimArchivalCatalogue.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            pimArchivalCatalogue.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getArchivalcatalogueid() != null ) {
            pimArchivalCatalogue.setArchivalcatalogueid( dto.getArchivalcatalogueid() );
        }
        if ( dto.getPimarchivesname() != null ) {
            pimArchivalCatalogue.setPimarchivesname( dto.getPimarchivesname() );
        }

        return pimArchivalCatalogue;
    }

    @Override
    public PimArchivalCatalogueDTO toDto(PimArchivalCatalogue entity) {
        if ( entity == null ) {
            return null;
        }

        PimArchivalCatalogueDTO pimArchivalCatalogueDTO = new PimArchivalCatalogueDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimArchivalCatalogueDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimArchivalCatalogueDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSerialnumber() != null ) {
            pimArchivalCatalogueDTO.setSerialnumber( entity.getSerialnumber() );
        }
        if ( entity.getArchivalcataloguename() != null ) {
            pimArchivalCatalogueDTO.setArchivalcataloguename( entity.getArchivalcataloguename() );
        }
        if ( entity.getPimarchivesid() != null ) {
            pimArchivalCatalogueDTO.setPimarchivesid( entity.getPimarchivesid() );
        }
        if ( entity.getEnable() != null ) {
            pimArchivalCatalogueDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreatedate() != null ) {
            pimArchivalCatalogueDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimArchivalCatalogueDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pimArchivalCatalogueDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            pimArchivalCatalogueDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getArchivalcatalogueid() != null ) {
            pimArchivalCatalogueDTO.setArchivalcatalogueid( entity.getArchivalcatalogueid() );
        }
        if ( entity.getPimarchivesname() != null ) {
            pimArchivalCatalogueDTO.setPimarchivesname( entity.getPimarchivesname() );
        }

        return pimArchivalCatalogueDTO;
    }

    @Override
    public List<PimArchivalCatalogue> toDomain(List<PimArchivalCatalogueDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimArchivalCatalogue> list = new ArrayList<PimArchivalCatalogue>( dtoList.size() );
        for ( PimArchivalCatalogueDTO pimArchivalCatalogueDTO : dtoList ) {
            list.add( toDomain( pimArchivalCatalogueDTO ) );
        }

        return list;
    }

    @Override
    public List<PimArchivalCatalogueDTO> toDto(List<PimArchivalCatalogue> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimArchivalCatalogueDTO> list = new ArrayList<PimArchivalCatalogueDTO>( entityList.size() );
        for ( PimArchivalCatalogue pimArchivalCatalogue : entityList ) {
            list.add( toDto( pimArchivalCatalogue ) );
        }

        return list;
    }
}
