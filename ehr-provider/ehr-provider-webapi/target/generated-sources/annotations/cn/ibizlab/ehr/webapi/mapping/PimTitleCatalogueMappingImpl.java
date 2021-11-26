package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimTitleCatalogue;
import cn.ibizlab.ehr.webapi.dto.PimTitleCatalogueDTO;
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
public class PimTitleCatalogueMappingImpl implements PimTitleCatalogueMapping {

    @Override
    public PimTitleCatalogue toDomain(PimTitleCatalogueDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimTitleCatalogue pimTitleCatalogue = new PimTitleCatalogue();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimTitleCatalogue.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimTitleCatalogue.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getDh() != null ) {
            pimTitleCatalogue.setDh( dto.getDh() );
        }
        if ( dto.getTitletype() != null ) {
            pimTitleCatalogue.setTitletype( dto.getTitletype() );
        }
        if ( dto.getZclc() != null ) {
            pimTitleCatalogue.setZclc( dto.getZclc() );
        }
        if ( dto.getPimtitlecataloguename() != null ) {
            pimTitleCatalogue.setPimtitlecataloguename( dto.getPimtitlecataloguename() );
        }
        if ( dto.getZcdj() != null ) {
            pimTitleCatalogue.setZcdj( dto.getZcdj() );
        }
        if ( dto.getPxh() != null ) {
            pimTitleCatalogue.setPxh( dto.getPxh() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimTitleCatalogue.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getPimtitlecatalogueid2() != null ) {
            pimTitleCatalogue.setPimtitlecatalogueid2( dto.getPimtitlecatalogueid2() );
        }
        if ( dto.getOrgid() != null ) {
            pimTitleCatalogue.setOrgid( dto.getOrgid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimTitleCatalogue.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getEnable() != null ) {
            pimTitleCatalogue.setEnable( dto.getEnable() );
        }
        if ( dto.getCreateman() != null ) {
            pimTitleCatalogue.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pimTitleCatalogue.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pimTitleCatalogue.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPimtitlecatalogueid() != null ) {
            pimTitleCatalogue.setPimtitlecatalogueid( dto.getPimtitlecatalogueid() );
        }
        if ( dto.getPimtitlecataloguename2() != null ) {
            pimTitleCatalogue.setPimtitlecataloguename2( dto.getPimtitlecataloguename2() );
        }

        return pimTitleCatalogue;
    }

    @Override
    public PimTitleCatalogueDTO toDto(PimTitleCatalogue entity) {
        if ( entity == null ) {
            return null;
        }

        PimTitleCatalogueDTO pimTitleCatalogueDTO = new PimTitleCatalogueDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimTitleCatalogueDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimTitleCatalogueDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getDh() != null ) {
            pimTitleCatalogueDTO.setDh( entity.getDh() );
        }
        if ( entity.getTitletype() != null ) {
            pimTitleCatalogueDTO.setTitletype( entity.getTitletype() );
        }
        if ( entity.getZclc() != null ) {
            pimTitleCatalogueDTO.setZclc( entity.getZclc() );
        }
        if ( entity.getPimtitlecataloguename() != null ) {
            pimTitleCatalogueDTO.setPimtitlecataloguename( entity.getPimtitlecataloguename() );
        }
        if ( entity.getZcdj() != null ) {
            pimTitleCatalogueDTO.setZcdj( entity.getZcdj() );
        }
        if ( entity.getPxh() != null ) {
            pimTitleCatalogueDTO.setPxh( entity.getPxh() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimTitleCatalogueDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getPimtitlecatalogueid2() != null ) {
            pimTitleCatalogueDTO.setPimtitlecatalogueid2( entity.getPimtitlecatalogueid2() );
        }
        if ( entity.getOrgid() != null ) {
            pimTitleCatalogueDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimTitleCatalogueDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getEnable() != null ) {
            pimTitleCatalogueDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreateman() != null ) {
            pimTitleCatalogueDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pimTitleCatalogueDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pimTitleCatalogueDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPimtitlecatalogueid() != null ) {
            pimTitleCatalogueDTO.setPimtitlecatalogueid( entity.getPimtitlecatalogueid() );
        }
        if ( entity.getPimtitlecataloguename2() != null ) {
            pimTitleCatalogueDTO.setPimtitlecataloguename2( entity.getPimtitlecataloguename2() );
        }

        return pimTitleCatalogueDTO;
    }

    @Override
    public List<PimTitleCatalogue> toDomain(List<PimTitleCatalogueDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimTitleCatalogue> list = new ArrayList<PimTitleCatalogue>( dtoList.size() );
        for ( PimTitleCatalogueDTO pimTitleCatalogueDTO : dtoList ) {
            list.add( toDomain( pimTitleCatalogueDTO ) );
        }

        return list;
    }

    @Override
    public List<PimTitleCatalogueDTO> toDto(List<PimTitleCatalogue> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimTitleCatalogueDTO> list = new ArrayList<PimTitleCatalogueDTO>( entityList.size() );
        for ( PimTitleCatalogue pimTitleCatalogue : entityList ) {
            list.add( toDto( pimTitleCatalogue ) );
        }

        return list;
    }
}
