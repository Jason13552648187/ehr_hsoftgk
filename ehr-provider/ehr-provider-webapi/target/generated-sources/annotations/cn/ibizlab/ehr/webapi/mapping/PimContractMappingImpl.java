package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimContract;
import cn.ibizlab.ehr.webapi.dto.PimContractDTO;
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
public class PimContractMappingImpl implements PimContractMapping {

    @Override
    public PimContract toDomain(PimContractDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimContract pimContract = new PimContract();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimContract.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimContract.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSslwpqgs() != null ) {
            pimContract.setSslwpqgs( dto.getSslwpqgs() );
        }
        if ( dto.getSydqsj() != null ) {
            pimContract.setSydqsj( dto.getSydqsj() );
        }
        if ( dto.getHtbh() != null ) {
            pimContract.setHtbh( dto.getHtbh() );
        }
        if ( dto.getHtlx() != null ) {
            pimContract.setHtlx( dto.getHtlx() );
        }
        if ( dto.getDemo() != null ) {
            pimContract.setDemo( dto.getDemo() );
        }
        if ( dto.getJobcontent() != null ) {
            pimContract.setJobcontent( dto.getJobcontent() );
        }
        if ( dto.getLegalorg() != null ) {
            pimContract.setLegalorg( dto.getLegalorg() );
        }
        if ( dto.getPimcontractname() != null ) {
            pimContract.setPimcontractname( dto.getPimcontractname() );
        }
        if ( dto.getJsrq() != null ) {
            pimContract.setJsrq( dto.getJsrq() );
        }
        if ( dto.getContracttype() != null ) {
            pimContract.setContracttype( dto.getContracttype() );
        }
        if ( dto.getHtzt() != null ) {
            pimContract.setHtzt( dto.getHtzt() );
        }
        if ( dto.getAction() != null ) {
            pimContract.setAction( dto.getAction() );
        }
        if ( dto.getQsrq() != null ) {
            pimContract.setQsrq( dto.getQsrq() );
        }
        if ( dto.getIsfirstsign() != null ) {
            pimContract.setIsfirstsign( dto.getIsfirstsign() );
        }
        if ( dto.getContractnum() != null ) {
            pimContract.setContractnum( dto.getContractnum() );
        }
        if ( dto.getCz() != null ) {
            pimContract.setCz( dto.getCz() );
        }
        if ( dto.getIsyemp() != null ) {
            pimContract.setIsyemp( dto.getIsyemp() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimContract.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getPimlabourcampanyid() != null ) {
            pimContract.setPimlabourcampanyid( dto.getPimlabourcampanyid() );
        }
        if ( dto.getContractsignorgid() != null ) {
            pimContract.setContractsignorgid( dto.getContractsignorgid() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimContract.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getOrmsignorgid() != null ) {
            pimContract.setOrmsignorgid( dto.getOrmsignorgid() );
        }
        if ( dto.getDuration() != null ) {
            pimContract.setDuration( dto.getDuration() );
        }
        if ( dto.getPimcontractid() != null ) {
            pimContract.setPimcontractid( dto.getPimcontractid() );
        }
        if ( dto.getHtsyts() != null ) {
            pimContract.setHtsyts( dto.getHtsyts() );
        }
        if ( dto.getSigningunit() != null ) {
            pimContract.setSigningunit( dto.getSigningunit() );
        }
        if ( dto.getCreateman() != null ) {
            pimContract.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pimContract.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimContract.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrgid() != null ) {
            pimContract.setOrgid( dto.getOrgid() );
        }
        if ( dto.getEmployeeandno() != null ) {
            pimContract.setEmployeeandno( dto.getEmployeeandno() );
        }
        if ( dto.getHtsytsColor() != null ) {
            pimContract.setHtsytsColor( dto.getHtsytsColor() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pimContract.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getUpdateman() != null ) {
            pimContract.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getEnable() != null ) {
            pimContract.setEnable( dto.getEnable() );
        }
        if ( dto.getOrmorgname() != null ) {
            pimContract.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getZgcode() != null ) {
            pimContract.setZgcode( dto.getZgcode() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimContract.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getOrmsignorgname() != null ) {
            pimContract.setOrmsignorgname( dto.getOrmsignorgname() );
        }
        if ( dto.getContractsignorgname() != null ) {
            pimContract.setContractsignorgname( dto.getContractsignorgname() );
        }
        if ( dto.getLevelcode() != null ) {
            pimContract.setLevelcode( dto.getLevelcode() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pimContract.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getPersonorgid() != null ) {
            pimContract.setPersonorgid( dto.getPersonorgid() );
        }
        if ( dto.getZzdzs() != null ) {
            pimContract.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getPimlabourcampanyname() != null ) {
            pimContract.setPimlabourcampanyname( dto.getPimlabourcampanyname() );
        }
        if ( dto.getYgbh() != null ) {
            pimContract.setYgbh( dto.getYgbh() );
        }
        if ( dto.getHtzzdzs() != null ) {
            pimContract.setHtzzdzs( dto.getHtzzdzs() );
        }
        if ( dto.getYgzt() != null ) {
            pimContract.setYgzt( dto.getYgzt() );
        }
        if ( dto.getDbdwsj() != null ) {
            pimContract.setDbdwsj( dto.getDbdwsj() );
        }
        if ( dto.getPersonorgname() != null ) {
            pimContract.setPersonorgname( dto.getPersonorgname() );
        }

        return pimContract;
    }

    @Override
    public PimContractDTO toDto(PimContract entity) {
        if ( entity == null ) {
            return null;
        }

        PimContractDTO pimContractDTO = new PimContractDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimContractDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimContractDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSslwpqgs() != null ) {
            pimContractDTO.setSslwpqgs( entity.getSslwpqgs() );
        }
        if ( entity.getSydqsj() != null ) {
            pimContractDTO.setSydqsj( entity.getSydqsj() );
        }
        if ( entity.getHtbh() != null ) {
            pimContractDTO.setHtbh( entity.getHtbh() );
        }
        if ( entity.getHtlx() != null ) {
            pimContractDTO.setHtlx( entity.getHtlx() );
        }
        if ( entity.getDemo() != null ) {
            pimContractDTO.setDemo( entity.getDemo() );
        }
        if ( entity.getJobcontent() != null ) {
            pimContractDTO.setJobcontent( entity.getJobcontent() );
        }
        if ( entity.getLegalorg() != null ) {
            pimContractDTO.setLegalorg( entity.getLegalorg() );
        }
        if ( entity.getPimcontractname() != null ) {
            pimContractDTO.setPimcontractname( entity.getPimcontractname() );
        }
        if ( entity.getJsrq() != null ) {
            pimContractDTO.setJsrq( entity.getJsrq() );
        }
        if ( entity.getContracttype() != null ) {
            pimContractDTO.setContracttype( entity.getContracttype() );
        }
        if ( entity.getHtzt() != null ) {
            pimContractDTO.setHtzt( entity.getHtzt() );
        }
        if ( entity.getAction() != null ) {
            pimContractDTO.setAction( entity.getAction() );
        }
        if ( entity.getQsrq() != null ) {
            pimContractDTO.setQsrq( entity.getQsrq() );
        }
        if ( entity.getIsfirstsign() != null ) {
            pimContractDTO.setIsfirstsign( entity.getIsfirstsign() );
        }
        if ( entity.getContractnum() != null ) {
            pimContractDTO.setContractnum( entity.getContractnum() );
        }
        if ( entity.getCz() != null ) {
            pimContractDTO.setCz( entity.getCz() );
        }
        if ( entity.getIsyemp() != null ) {
            pimContractDTO.setIsyemp( entity.getIsyemp() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimContractDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getPimlabourcampanyid() != null ) {
            pimContractDTO.setPimlabourcampanyid( entity.getPimlabourcampanyid() );
        }
        if ( entity.getContractsignorgid() != null ) {
            pimContractDTO.setContractsignorgid( entity.getContractsignorgid() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimContractDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getOrmsignorgid() != null ) {
            pimContractDTO.setOrmsignorgid( entity.getOrmsignorgid() );
        }
        if ( entity.getDuration() != null ) {
            pimContractDTO.setDuration( entity.getDuration() );
        }
        if ( entity.getPimcontractid() != null ) {
            pimContractDTO.setPimcontractid( entity.getPimcontractid() );
        }
        if ( entity.getHtsyts() != null ) {
            pimContractDTO.setHtsyts( entity.getHtsyts() );
        }
        if ( entity.getSigningunit() != null ) {
            pimContractDTO.setSigningunit( entity.getSigningunit() );
        }
        if ( entity.getCreateman() != null ) {
            pimContractDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pimContractDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimContractDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrgid() != null ) {
            pimContractDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getEmployeeandno() != null ) {
            pimContractDTO.setEmployeeandno( entity.getEmployeeandno() );
        }
        if ( entity.getHtsytsColor() != null ) {
            pimContractDTO.setHtsytsColor( entity.getHtsytsColor() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pimContractDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getUpdateman() != null ) {
            pimContractDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getEnable() != null ) {
            pimContractDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getOrmorgname() != null ) {
            pimContractDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getZgcode() != null ) {
            pimContractDTO.setZgcode( entity.getZgcode() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimContractDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getOrmsignorgname() != null ) {
            pimContractDTO.setOrmsignorgname( entity.getOrmsignorgname() );
        }
        if ( entity.getContractsignorgname() != null ) {
            pimContractDTO.setContractsignorgname( entity.getContractsignorgname() );
        }
        if ( entity.getLevelcode() != null ) {
            pimContractDTO.setLevelcode( entity.getLevelcode() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pimContractDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getPersonorgid() != null ) {
            pimContractDTO.setPersonorgid( entity.getPersonorgid() );
        }
        if ( entity.getZzdzs() != null ) {
            pimContractDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getPimlabourcampanyname() != null ) {
            pimContractDTO.setPimlabourcampanyname( entity.getPimlabourcampanyname() );
        }
        if ( entity.getYgbh() != null ) {
            pimContractDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getHtzzdzs() != null ) {
            pimContractDTO.setHtzzdzs( entity.getHtzzdzs() );
        }
        if ( entity.getYgzt() != null ) {
            pimContractDTO.setYgzt( entity.getYgzt() );
        }
        if ( entity.getDbdwsj() != null ) {
            pimContractDTO.setDbdwsj( entity.getDbdwsj() );
        }
        if ( entity.getPersonorgname() != null ) {
            pimContractDTO.setPersonorgname( entity.getPersonorgname() );
        }

        return pimContractDTO;
    }

    @Override
    public List<PimContract> toDomain(List<PimContractDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimContract> list = new ArrayList<PimContract>( dtoList.size() );
        for ( PimContractDTO pimContractDTO : dtoList ) {
            list.add( toDomain( pimContractDTO ) );
        }

        return list;
    }

    @Override
    public List<PimContractDTO> toDto(List<PimContract> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimContractDTO> list = new ArrayList<PimContractDTO>( entityList.size() );
        for ( PimContract pimContract : entityList ) {
            list.add( toDto( pimContract ) );
        }

        return list;
    }
}
